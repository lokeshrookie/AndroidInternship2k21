package com.example.trailtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
//import android.view.View;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.ACTIVITY_SERVICE;
import static com.example.trailtoast.R.layout.*;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        tv1 = findViewById(R.id.tv1);
//        tv1.setOnClickListener(v -> Toast.makeText(MainActivity.this, "This is the first textview", Toast.LENGTH_SHORT).show());
        tv1.setOnClickListener(v -> Toast.makeText(MainActivity.this, "THis is the ", Toast.LENGTH_LONG));
        tv2 = findViewById(R.id.tv2);
//        tv2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "This is second textview", Toast.LENGTH_SHORT).show());
//       button.setOnClickListener(View );


        button.setOnClickListener(v -> Toast.makeText(MainActivity.this, "This is button", Toast.LENGTH_SHORT).show());
    }

}



