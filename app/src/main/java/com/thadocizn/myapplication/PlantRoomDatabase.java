package com.thadocizn.myapplication;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.thadocizn.myapplication.classes.Plant;

import java.util.ArrayList;
import java.util.List;

@Database(entities = {Plant.class}, version = 1)
public abstract class PlantRoomDatabase extends RoomDatabase {

    public abstract PlantDao plantDao();
    private static PlantRoomDatabase INSTANCE;

    static PlantRoomDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (PlantRoomDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PlantRoomDatabase.class, "plant_database")
                            .fallbackToDestructiveMigration()
                            .addCallback(callback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback callback =
            new RoomDatabase.Callback(){
                @Override
                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final PlantDao dao;
        private ArrayList<Plant> list;
        private Plant[] plants;
        public PopulateDbAsync(PlantRoomDatabase instance) {
            dao = instance.plantDao();
            list = new ArrayList<>();
            list.add(new Plant("charles", "hhsjs","gfshs", "sgfg", "8", "9"));
            list.add(new Plant("john", "hhsjs","gfshs", "sgfg", "8", "9"));
            list.add(new Plant("dave", "hhsjs","gfshs", "sgfg", "8", "9"));
            list.add(new Plant("debbie", "hhsjs","gfshs", "sgfg", "8", "9"));

            plants = new Plant[list.size()];
            plants = list.toArray(plants);

        }

        @Override
        protected Void doInBackground(Void... voids) {
            //dao.deleteAll();

            if(dao.getAnyPlant().length < 1){
                Plant plant = new Plant("hank",
                        "9wk",
                        "medium",
                        "hot",
                        "8",
                        "12");
                dao.insert(plant);
            }

           return null;
        }
    }
}
