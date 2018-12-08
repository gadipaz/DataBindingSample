package com.paz.gadi.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.paz.gadi.databindingsample.databinding.ActivitySecondBinding;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        recyclerView = binding.myRecyclerView;

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<TemperatureData> items =
                Arrays.asList(
                        new TemperatureData("Hamburg", "5", "http://lorempixel.com/40/40/"),
                        new TemperatureData("Berlin", "6","http://lorempixel.com/50/50/"));

        // define an adapter
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}
