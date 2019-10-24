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
//    public Button orderNowButton;


    public FoodViewHolder(View v){
        super(v);
        view = v;

        foodName = v.findViewById(R.id.foodName);
        foodPrice = v.findViewById(R.id.foodPrice);
        picture = v.findViewById(R.id.foodImage);
//        orderNowButton = v.findViewById(R.id.orderNow);

    }

    public void buttonPressed(final int foodID) {
        final Food foodAtPosition = FoodDatabase.getFoodByID(foodID);

//        foodName.setText(foodAtPosition.getName());
//        foodPrice.setText(foodAtPosition.getPrice().toString());


//        orderNowButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
////                Context context = v.getContext();
////                Intent intent = new Intent(context,Detail_Activity.class);
////                intent.putExtra("FoodID", foodID);
////                context.startActivity(intent);
//
//                Context context = view.getContext();
//
//                Intent intent = new Intent(context, Detail_Activity.class);
//                intent.putExtra("FoodID", foodAtPosition.getFoodID());
//                context.startActivity(intent);
//
//            }
//        });

    }
}
