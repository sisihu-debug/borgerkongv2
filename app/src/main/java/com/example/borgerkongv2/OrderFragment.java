package com.example.borgerkongv2;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

    View view;

    private TextView detail_foodNameTextView;
    private TextView detail_foodPriceTextView;
    private TextView detail_foodDescriptionTextView;
    private ImageView detail_foodImageImageView;
    private TextView orderTotalTV;
    private Button orderTotalButton;



    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_order, container, false);

        view = inflater.inflate(R.layout.fragment_order, container, false);
        //Inflate View

        detail_foodNameTextView = view.findViewById(R.id.detail_foodName);
        detail_foodPriceTextView = view.findViewById(R.id.detail_foodPrice);
        detail_foodDescriptionTextView = view.findViewById(R.id.detail_foodDescription);
        detail_foodImageImageView = view.findViewById(R.id.detail_foodImage);
        orderTotalTV = view.findViewById(R.id.orderTotalTV);
        orderTotalButton = view.findViewById(R.id.orderTotalBtn);

        orderTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double orderTotalView = OrderCalculation.calculateOrder(OrderDatabase.orders);

                String stringdouble = Double.toString(orderTotalView);

                orderTotalTV.setText(stringdouble);

            }
        });



        return view;

    }











}
