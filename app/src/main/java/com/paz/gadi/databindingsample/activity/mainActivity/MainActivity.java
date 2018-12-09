package com.paz.gadi.databindingsample.activity.mainActivity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.paz.gadi.databindingsample.R;
import com.paz.gadi.databindingsample.model.TemperatureData;
import com.paz.gadi.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        TemperatureData temperatureData = new TemperatureData("Hamburg", "10", "http://lorempixel.com/40/40/");
        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
    }
}
