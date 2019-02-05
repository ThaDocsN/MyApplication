package com.thadocizn.myapplication.classes;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class Plant extends BaseObservable {

    private String plantName;
    private String plantfloweringTime;
    private String plantCharacteristics;
    private String plantClimate;
    private String plantWaterPh;

    public Plant(String plantName, String plantfloweringTime, String plantCharacteristics, String plantClimate, String plantWaterPh) {
        this.plantName = plantName;
        this.plantfloweringTime = plantfloweringTime;
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
    public String getPlantfloweringTime() {
        return plantfloweringTime;
    }

    public void setPlantfloweringTime(String plantfloweringTime) {
        this.plantfloweringTime = plantfloweringTime;
        notifyPropertyChanged(BR.plantfloweringTime);

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
