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

    public ImageView picture;
    public Button button;


    public FoodViewHolder(View v){
        super(v);
        view = v;
        foodName = v.findViewById(R.id.foodName);

        picture = v.findViewById(R.id.foodImage);
        button = v.findViewById(R.id.orderNow);

    }

    public void buttonPressed(final int foodID) {
        //Food foodAtPosition = FakeDatabase.getArticleById(foodID);

//        foodName.setText(foodAtPosition.getFoodName());
//        foodImage = view.findViewById(R.id.foodImage);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context,Detail_Activity.class);
                intent.putExtra("FoodID", foodID);
                context.startActivity(intent);
            }
        });

    }
}
