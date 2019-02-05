package com.thadocizn.myapplication.adapters;

import com.thadocizn.myapplication.R;
import com.thadocizn.myapplication.classes.Garden;

import java.util.List;

public class GardenAdapter extends MyBaseAdapter {

    List<Garden> data;

    public GardenAdapter(List<Garden> data) {
        this.data = data;
    }

    @Override
    public int getLayoutIdForType(int view) {

        //todo change holder
        return R.layout.item_list_cardiew;
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
