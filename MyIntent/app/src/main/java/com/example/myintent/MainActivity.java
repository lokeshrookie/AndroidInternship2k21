package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//declare the views here
    EditText name,number,link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize all views here
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        link = findViewById(R.id.link);
    }

    public void next(View view) {
        //here we will work with explicit intent
        String n = name.getText().toString(); //data in any form will be converted to String.
        //intent syntax  :  Intent obj = Intent(present class,next class)
        //here intent will decide but will not naviagte to next class
        //
        Intent i = new Intent(this,SecondActivity.class);
        //to carry using holder
        i.putExtra("key",n);
        startActivity(i);
    }

    public void dial(View view) {
        String n = number.getText().toString();
        //Uri - Unified resource identifier
        //phone- tel: web - https:// , loc - geo:lat,lom//to identify number, webidte, geo lacation
        Uri uri = Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void open(View view) {
     String n = link.getText().toString();
     Uri uri = Uri.parse("https://"+n);
     Intent i = new Intent(Intent.ACTION_VIEW,uri);
     startActivity(i);
    }

}









