package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//import android.view.View;
//import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("hello", " This is on create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("hello", "This is on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("hello", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("hello", "tis si on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Hello", "On stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("hello", "this is On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("hello", "This is on Destroy");
    }
}