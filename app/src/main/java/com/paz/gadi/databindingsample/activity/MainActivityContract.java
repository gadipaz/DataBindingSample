package com.paz.gadi.databindingsample.activity;

import com.paz.gadi.databindingsample.model.TemperatureData;

public interface MainActivityContract {
    interface Presenter {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    interface View {
        void showData(TemperatureData temperatureData);
    }

}
