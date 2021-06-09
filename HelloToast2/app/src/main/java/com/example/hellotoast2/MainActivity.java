package com.example.hellotoast2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare te views here
    // Dont use capital letters during declaring the variables

    Button toast, count;
    TextView tv;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial the views here
        toast = findViewById(R.id.toast);
        count = findViewById(R.id.count);
        tv = findViewById(R.id.tv);
        count.setOnClickListener(new View.OnClickListener() { //
            @Override
            public void onClick(View v) {
                i++;
                tv.setText(""+i);
               // tv.setText(String.valueOf(i));

            }
        }); //to make button clickable

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Welcome to Android. Your count is " +i,
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}