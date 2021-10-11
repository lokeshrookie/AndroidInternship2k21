package com.example.trailtoast;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

//import androidx.annotation.Nullable;
import  androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity{
    Button toast, count;
    TextView textView;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.findViewById(R.id.tv);
        toast.findViewById(R.id.toast);
        count.findViewById(R.id.count);
    }
}