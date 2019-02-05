package com.thadocizn.myapplication;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.thadocizn.myapplication.classes.Plant;

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
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
