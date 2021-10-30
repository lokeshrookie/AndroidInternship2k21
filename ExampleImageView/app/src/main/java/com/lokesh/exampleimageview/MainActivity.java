package com.lokesh.exampleimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv.findViewById(R.id.imageView);

    }

    public void next(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
}

