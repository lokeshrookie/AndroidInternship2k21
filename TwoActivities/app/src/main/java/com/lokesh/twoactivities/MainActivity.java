package com.lokesh.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
//    ImageView iv =  findViewById(R.id.imageView3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        iv.setImageResource(R.drawable.uce);
//        iv.animate();

    }

    public void Second(View view) {
        Intent i = new Intent(getApplicationContext(),ActivityTwo.class);
        startActivity(i);

    }
}