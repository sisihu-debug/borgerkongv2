package com.example.borgerkongv2;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder{

    public View view;
    public TextView foodName;
    public TextView foodPrice;
    public ImageView picture;



    public FoodViewHolder(View v){
        super(v);
        view = v;

        foodName = v.findViewById(R.id.foodName);
        foodPrice = v.findViewById(R.id.foodPrice);
        picture = v.findViewById(R.id.foodImage);


    }


}
