package com.paz.gadi.databindingsample.activity.secondActivity;

import android.content.Context;
import android.content.Intent;

import com.paz.gadi.databindingsample.model.Employee;

public class SecondActivityPresenter implements SecondActivityContract.Presenter {
    private SecondActivityContract.View view;
    private Context ctx;

    public SecondActivityPresenter(SecondActivityContract.View view, Context ctx) {
        this.view = view;
        this.ctx = ctx;
    }

    @Override
    public void onItemClick(Employee employee) {
        int i = 5;
        view.showData(employee);
    }
}
