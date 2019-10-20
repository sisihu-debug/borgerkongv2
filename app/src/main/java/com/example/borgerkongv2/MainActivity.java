package com.example.borgerkongv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {
    //create xml view links
    ImageButton browseBtn;
    ImageButton orderBtn;

    //Create FragLinks

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    DetailFragment detailFragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //FoodAdapter foodAdapter = new FoodAdapter(getApplicationContext(),android.R.layout.food_detail, stringArray);




}
