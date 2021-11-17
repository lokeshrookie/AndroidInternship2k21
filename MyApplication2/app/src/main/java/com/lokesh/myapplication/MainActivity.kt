package com.lokesh.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvv: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvv.findViewById<TextView>(R.id.tv)
        tvv.text = "updated"
//        tvv.findViewById<TextView>(R.id.tv);
//        tvv.setcontex

    }
}