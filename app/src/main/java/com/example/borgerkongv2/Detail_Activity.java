package com.example.borgerkongv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_Activity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView priceTextView;
    private TextView despTextView;
    private ImageView imageView;
    private ImageButton placeOrder;

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int foodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Food food = FoodDatabase.getFoodByID(foodID);

        nameTextView = findViewById(R.id.foodName);
        priceTextView = findViewById(R.id.foodPrice);
        despTextView = findViewById(R.id.foodDescription);
        imageView = findViewById(R.id.foodImage);
        placeOrder = findViewById(R.id.orderBtn);

        // Set the views to show the data of our object
        nameTextView.setText(food.getName());
        priceTextView.setText(food.getPrice().toString());
        despTextView.setText(food.getDescription());
        imageView.setImageResource(food.getImageDrawableId());



        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = view.getContext();

                Intent intent = new Intent(context, OrderDatabase.class);

                intent.putExtra(int foodID, int 1);


//                intent.putExtra("FoodID", foodAtPosition.getFoodID());
//                context.startActivity(intent);


            }


        });


    }




}
