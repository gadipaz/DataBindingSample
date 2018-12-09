package com.paz.gadi.databindingsample.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.paz.gadi.databindingsample.BR;
import com.paz.gadi.databindingsample.R;
import com.paz.gadi.databindingsample.activity.secondActivity.SecondActivityContract;
import com.paz.gadi.databindingsample.activity.secondActivity.SecondActivityPresenter;
import com.paz.gadi.databindingsample.model.Employee;

import java.util.List;

public class EmployeeAdapter extends MyBaseAdapter implements SecondActivityContract.View{
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
    public void setPresenter(ViewDataBinding binding, ViewGroup parent) {
        SecondActivityPresenter presenter = new SecondActivityPresenter(this, parent.getContext());
        binding.setVariable(BR.presenter,presenter);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void showData(Employee employee) {
        int i = 5;
    }
}

