package com.example.borgerkongv2;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

    //call method to return order items list

    ArrayList<Food> orderToAdapt;


    public void setData(ArrayList<Food> orderToAdapt){
        this.orderToAdapt = orderToAdapt;


    }

    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_row,parent,false);

        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position){

        //view holder, position of recycler view
        //holder.articleID = setTime.order.getFoodID;


        final Order orderAtPosition = orderToAdapt.get(position);

        holder.foodName.setText(orderAtPosition.getName());
        //holder.foodPrice.setText(foodAtPosition.getPrice().toString());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Detail_Activity.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.picture.setOnClickListener(new View.OnClickListener() {


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
        this.orderToAdapt = food;

    }

    @Override
    public int getItemCount() {
        return orderToAdapt.size();
    }
}
