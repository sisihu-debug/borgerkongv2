package com.example.borgerkongv2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    ArrayList<Food> food;

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_row,parent,false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position){
        final Food foodAtPosition = food.get(position);
        holder.buttonPressed(foodAtPosition.getFoodID());
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;

    }

    @Override
    public int getItemCount() {
        return food.size();
    }
}




