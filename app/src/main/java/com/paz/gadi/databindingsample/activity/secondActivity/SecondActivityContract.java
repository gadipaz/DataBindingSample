package com.paz.gadi.databindingsample.activity.secondActivity;

import com.paz.gadi.databindingsample.model.Employee;

public interface SecondActivityContract {
    interface Presenter {
        void onItemClick(Employee employee);
    }

    interface View {
        void showData(Employee employee);
    }

}
