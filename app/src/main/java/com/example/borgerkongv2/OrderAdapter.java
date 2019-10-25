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

    //instantiate an ordertoadapt arraylist

    ArrayList<Order> orderToAdapt;



    //set data to add orders to orderToAdapt
    public void setData(ArrayList<Order> orderToAdapt){
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

        //set each row of order data


        final Order orderAtPosition = orderToAdapt.get(position);

        int foodIDOrderRow = orderAtPosition.getFoodID();

        Food foodAtPosition = FoodDatabase.getFoodByID(foodIDOrderRow);

        holder.foodName.setText(foodAtPosition.getName());

        holder.orderQuantity.setText(String.valueOf(orderAtPosition.getOrderQuantity()));

        holder.foodName.setText(foodAtPosition.getName());


        holder.picture.setImageResource(foodAtPosition.getImageDrawableId());


        //lead user back to details page if needed to check details of ordered foods

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Detail_Activity.class);
                intent.putExtra("FoodID", orderAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.picture.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, Detail_Activity.class);
                intent.putExtra("FoodID", orderAtPosition.getFoodID());
                context.startActivity(intent);
            }


        });


    }



    @Override
    public int getItemCount() {
        return orderToAdapt.size();
    }
}
