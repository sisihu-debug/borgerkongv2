package com.example.borgerkongv2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderCalculation {

    public static double calculateOrder( HashMap<Integer,Integer> orders){
        double totalAmount = 0.0;

        Iterator orderIterator = orders.entrySet().iterator();

        while (orderIterator.hasNext()) {
            Map.Entry<Integer, Integer> order = (Map.Entry) orderIterator.next();
            int id = order.getKey();
            int quantity = order.getValue();

            totalAmount += FoodDatabase.getFoodByID(id).getPrice() * quantity;

        }

        return totalAmount;


//for loops dont work for hashmaps


//        for( int x = 0; x <= orders.size(); x++){
//            Food food = FoodDatabase.getFoodByID(foodID);
//            Double foodItemPrice = food.getPrice();
//            int foodQuantity = orders.get(foodID);
//
//
//        }




    }
}
