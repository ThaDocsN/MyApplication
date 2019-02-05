package com.thadocizn.myapplication;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.thadocizn.myapplication.classes.Plant;

import java.util.List;

public class PlantRepository {

    private PlantDao plantDao;
    private LiveData<List<Plant>> allPlants;

    public PlantRepository(Application application) {
        PlantRoomDatabase database = PlantRoomDatabase.getDatabase(application);
        plantDao = database.plantDao();
        allPlants = plantDao.getAllPlants();
    }

    public LiveData<List<Plant>> getAllPlants(){
        return allPlants;
    }

    public void insert(Plant plant){
        new insertAsyncTask(plantDao).execute(plant);
    }

    private static class insertAsyncTask extends AsyncTask<Plant, Void, Void> {

        private PlantDao asyncTaskDao;

        public insertAsyncTask(PlantDao plantDao) {
            asyncTaskDao = plantDao;
        }

        @Override
        protected Void doInBackground(Plant... plants) {
            asyncTaskDao.insert(plants[0]);
            return null;
        }
    }
}
