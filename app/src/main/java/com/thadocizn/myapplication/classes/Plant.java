package com.thadocizn.myapplication.classes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;

import com.android.databinding.library.baseAdapters.BR;

@Entity(tableName = "plant_table")
public class Plant extends BaseObservable {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    private String plantId;
    @NonNull
    @ColumnInfo
    private String plantName;
    @NonNull
    @ColumnInfo
    private String plantFloweringTime;
    @ColumnInfo
    private String plantCharacteristics;
    @ColumnInfo
    private String plantClimate;
    @ColumnInfo
    private String plantWaterPh;

    public Plant(String plantName, String plantFloweringTime, String plantCharacteristics, String plantClimate, String plantWaterPh) {
        this.plantName = plantName;
        this.plantFloweringTime = plantFloweringTime;
        this.plantCharacteristics = plantCharacteristics;
        this.plantClimate = plantClimate;
        this.plantWaterPh = plantWaterPh;
    }

    @Bindable
    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
        notifyPropertyChanged(BR.plantName);

    }
    @Bindable
    public String getPlantFloweringTime() {
        return plantFloweringTime;
    }

    public void setPlantFloweringTime(String plantFloweringTime) {
        this.plantFloweringTime = plantFloweringTime;
        notifyPropertyChanged(BR.plantFloweringTime);

    }
    @Bindable
    public String getPlantCharacteristics() {
        return plantCharacteristics;
    }

    public void setPlantCharacteristics(String plantCharacteristics) {
        this.plantCharacteristics = plantCharacteristics;
        notifyPropertyChanged(BR.plantCharacteristics);

    }
    @Bindable
    public String getPlantClimate() {
        return plantClimate;
    }

    public void setPlantClimate(String plantClimate) {
        this.plantClimate = plantClimate;
        notifyPropertyChanged(BR.plantClimate);

    }

    @Bindable
    public String getPlantWaterPh() {
        return plantWaterPh;
    }

    public void setPlantWaterPh(String plantWaterPh) {
        this.plantWaterPh = plantWaterPh;
        notifyPropertyChanged(BR.plantWaterPh);

    }
}
