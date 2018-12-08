package com.paz.gadi.databindingsample.adapter;

import com.paz.gadi.databindingsample.R;
import com.paz.gadi.databindingsample.model.Employee;

import java.util.List;

public class EmployeeAdapter extends MyBaseAdapter {
    List<Employee> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public EmployeeAdapter(List<Employee> myDataset) {
        data = myDataset;
    }
    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.row_employee;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }}
