package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
//Declare views here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //initialize views here
        String n = getIntent().getStringExtra("key");//to get String form Intent
        Toast.makeText(this, "welcome " +n,
                Toast.LENGTH_SHORT).show();
    }
}