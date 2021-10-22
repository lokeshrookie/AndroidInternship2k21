package com.Lokesh.covidtracker;

import android.content.Context;
import android.text.Layout;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder > {

    int m = 1;
    Context context;
    List<ModelClass> countrylist;

    public  Adapter(Context context, List<ModelClass> countrylist){
        this.context = context;
        this.countrylist = countrylist;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_of_item, null, false );
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return countrylist.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
        }
    }
}
