package com.example.examplkedatabase.RDB;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//RDB means android root database
@Entity

public class RTalbe {



    @NonNull
    @PrimaryKey

    String sroll;

    String sname,snumber;
    public RTalbe(@NonNull String sroll, String sname, String snumber) {
    }
        this.sroll = sroll;
        this.sname = sname;
        this.snumber = snumber;
}
