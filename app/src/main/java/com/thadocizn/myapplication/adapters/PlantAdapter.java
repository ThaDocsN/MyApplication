package com.thadocizn.myapplication.adapters;

import com.thadocizn.myapplication.R;
import com.thadocizn.myapplication.classes.Plant;

import java.util.List;

public class PlantAdapter extends MyBaseAdapter {

    private List<Plant> data;


    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.item_list_cardiew;
    }

    public PlantAdapter(List<Plant> data) {
        this.data = data;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

