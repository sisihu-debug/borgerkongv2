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

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder>{

    ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt){
        this.foodToAdapt = foodToAdapt;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_row,parent,false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position){





        final Food foodAtPosition = foodToAdapt.get(position);

        holder.foodName.setText(foodAtPosition.getName());



        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Detail_Activity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });


        holder.picture.setImageResource(foodAtPosition.getImageDrawableId());
    }

    public void setFood(ArrayList<Food> food) {
        this.foodToAdapt = food;

    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }
}




