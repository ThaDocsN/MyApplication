package com.thadocizn.myapplication.classes;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;
import com.thadocizn.myapplication.MyBaseAdapter;
import com.thadocizn.myapplication.R;

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

