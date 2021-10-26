package com.Lokesh.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.service.voice.AlwaysOnHotwordDetector;
import android.view.Window;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

import org.eazegraph.lib.charts.PieChart;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    CountryCodePicker countryCodePicker;
    TextView mmtodaytotal, mtotal, mactive, mtodayactive, mrecovered, mtodayrecovered, mdeaths, mtodaydeaths;

    String Country;
    TextView mfilter;
    Spinner spinner;
    String[] types = {"cases", "deaths", "recovered", "active"};
    private List<ModelClass> modelClassList;
    private List<ModelClass> modelClassList2;
    PieChart mpiechart;
    private RecyclerView recyclerView;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        countryCodePicker = findViewById(R.id.ccp);
        mtodayactive = findViewById(R.id.todayactive);
        mactive = findViewById( R.id.totalactive);
        mdeaths = findViewById(R.id.totaldeaths);
        mtodaydeaths = findViewById(R.id.todaydeaths);
        mrecovered = findViewById(R.id.totalrecovered);
        mtodayrecovered = findViewById(R.id.todayrecovered);
        mtotal = findViewById(R.id.totalcase);
        mmtodaytotal = findViewById(R.id.todaytotal);
        mpiechart = findViewById(R.id.piechart);
        spinner = findViewById(R.id.spinner);
        mfilter = findViewById(R.id.filter);
        recyclerView = findViewById(R.id.recyclerview);
        modelClassList = new ArrayList<>();
        modelClassList2 = new ArrayList<>();


        spinner.setOnItemSelectedListener(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);




        ApiUtilities.getAPIInterface().getcountrydata().enqueue(new Callback<List<ModelClass>>() {
            @Override
            public void onResponse(Call<List<ModelClass>> call, Response<List<ModelClass>> response) {
                modelClassList2.addAll(response.body());


            }

            @Override
            public void onFailure(Call<List<ModelClass>> call, Throwable t) {

            }
        });




    adapter = new Adapter(getApplicationContext(), modelClassList2);
    recyclerView.setLayoutManager(new LinearLayoutManager((this)));
//    adapter  = new Adapter(getApplicationContext(),modelClassList2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
}






































