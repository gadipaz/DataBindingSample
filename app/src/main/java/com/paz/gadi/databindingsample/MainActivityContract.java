package com.paz.gadi.databindingsample;

public interface MainActivityContract {
    interface Presenter {
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    interface View {
        void showData(TemperatureData temperatureData);
    }

}
