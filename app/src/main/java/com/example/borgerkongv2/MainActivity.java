package com.example.borgerkongv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {
    //create xml view links
    Button browseBtn;
    Button orderBtn;

    //Create FragLinks

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    BrowseFragment browseFragment;
    OrderFragment orderFragment;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate new fragments

        browseFragment = new BrowseFragment();
        orderFragment = new OrderFragment();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, browseFragment);
        fragmentTransaction.commit();

        //declare views

        browseBtn = findViewById(R.id.browseBtn);
        orderBtn = findViewById(R.id.orderBtn);

        //create onClickListeners

        browseBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_slot, browseFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_slot, orderFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });





    }
    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, fragment);
        fragmentTransaction.commit();
    }

    //FoodAdapter foodAdapter = new FoodAdapter(getApplicationContext(),android.R.layout.food_detail, stringArray);




}
