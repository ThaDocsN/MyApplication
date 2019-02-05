package com.thadocizn.myapplication;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.thadocizn.myapplication.classes.Plant;

import java.util.List;

public interface PlantDao {

    @Insert
    void insert(Plant plant);

    @Query("DELETE FROM plant_table")
    void deleteAll();

    @Query("SELECT * FROM plant_table ORDER BY plantName ASC")
    LiveData<List<Plant>> getAllPlants();
}
