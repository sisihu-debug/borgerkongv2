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
    private Button placeOrder;
    private Button addQuantity;
    private Button minusQuantity;
    private TextView quantityTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        final int foodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        final Food food = FoodDatabase.getFoodByID(foodID);

        nameTextView = findViewById(R.id.foodName);
        priceTextView = findViewById(R.id.foodPrice);
        despTextView = findViewById(R.id.foodDescription);
        imageView = findViewById(R.id.foodImage);
        placeOrder = findViewById(R.id.placeOrder);
        addQuantity = findViewById(R.id.addQuant);
        minusQuantity = findViewById(R.id.minusQuant);
        quantityTextView = findViewById(R.id.quantNumber);

        // Set the views to show the data of our object

        String dollarSign = "$";

        nameTextView.setText(food.getName());
        priceTextView.setText(dollarSign+food.getPrice().toString());
        despTextView.setText(food.getDescription());
        imageView.setImageResource(food.getImageDrawableId());


        //set initial quantity
        final int initialQuantity = 1;

        quantityTextView.setText(String.valueOf(initialQuantity));

        addQuantity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String newQuantityString = quantityTextView.getText().toString();
                int newQuantity = Integer.parseInt(newQuantityString);
                newQuantity++;

                quantityTextView.setText(String.valueOf(newQuantity));

            }
        });

        minusQuantity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if( quantityTextView.getText().equals("1")){

                } else{

                    String newQuantityString = quantityTextView.getText().toString();
                    int newQuantity = Integer.parseInt(newQuantityString);
                    newQuantity--;

                    quantityTextView.setText(String.valueOf(newQuantity));

                }

            }
        });


        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OrderDatabase.addToOrder(food.getFoodID(),Integer.valueOf(quantityTextView.getText().toString()));
                Context context = getApplicationContext();
                CharSequence text = "Added to Order!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }


        });


    }




}
