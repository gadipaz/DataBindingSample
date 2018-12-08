package com.paz.gadi.databindingsample;

import java.util.List;

public class MyAdapter extends MyBaseAdapter {

    List<TemperatureData> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<TemperatureData> myDataset) {
        data = myDataset;
    }
    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.rowlayout;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
