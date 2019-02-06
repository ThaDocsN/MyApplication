package com.thadocizn.myapplication;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.thadocizn.myapplication.classes.Plant;

import java.util.List;
@Dao
public interface PlantDao {

    @Query("SELECT * FROM plant_table LIMIT 1")
    Plant[] getAnyPlant();

    @Insert
    void insert(Plant plant);

    @Query("DELETE FROM plant_table")
    void deleteAll();

    @Query("SELECT * FROM plant_table ORDER BY plantName ASC")
    LiveData<List<Plant>> getAllPlants();
}
