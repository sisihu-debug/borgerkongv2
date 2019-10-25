package com.example.borgerkongv2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class OrderViewHolder extends RecyclerView.ViewHolder{

    public View view;
    public TextView foodName;

    public ImageView picture;
    public TextView orderQuantity;





    public OrderViewHolder(View v){
        super(v);
        view = v;

        foodName = v.findViewById(R.id.foodNameOrderRow);

        picture = v.findViewById(R.id.foodImageOrderRow);
        orderQuantity = v.findViewById(R.id.quantityOrderRow);





    }
}
