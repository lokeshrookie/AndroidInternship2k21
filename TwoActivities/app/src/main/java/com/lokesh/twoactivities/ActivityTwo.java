package com.lokesh.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityTwo extends AppCompatActivity {
//ImageView iv2 = findViewById(R.id.imageView4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
//        iv2.setImageResource(R.drawable.aknu_header);
    }

    public void first(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

    }
}