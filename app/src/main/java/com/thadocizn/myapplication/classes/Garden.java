package com.thadocizn.myapplication.classes;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class Garden extends BaseObservable {
    private String nutrients;
    private String growingMedium;
    private String plantName;

    public Garden(String nutrients, String growingMedium, String plantName) {
        this.nutrients = nutrients;
        this.growingMedium = growingMedium;
        this.plantName = plantName;
    }

    @Bindable
    public String getNutrients() {
        return nutrients;
    }

    public void setNutrients(String nutrients) {
        this.nutrients = nutrients;
        notifyPropertyChanged(BR.nutrients);

    }

    @Bindable
    public String getGrowingMedium() {
        return growingMedium;
    }

    public void setGrowingMedium(String growingMedium) {
        this.growingMedium = growingMedium;
        notifyPropertyChanged(BR.growingMedium);

    }

    @Bindable
    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
        notifyPropertyChanged(BR.plantName);

    }
}
