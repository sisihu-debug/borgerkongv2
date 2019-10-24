package com.example.borgerkongv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrderDatabase {

//    public static OrderDatabase getFoodByID(int foodID) {
//        return OrderDatabase.get(foodID);
//    }

//    public static ArrayList<Food> getAllFood() {
//        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));

        //converts hashmap of orders to arraylist as orders, and then multiply by price
   // }

    private static final HashMap<Integer, Integer> orders = new HashMap<>();

    private static void addToOrder(int foodID, int orderQuantity){
        if (orders.containsKey(foodID)){
            int prevOrderQuantity = orders.get(foodID);
            orders.put(foodID, prevOrderQuantity + orderQuantity);
        } else{
            orders.put(foodID, orderQuantity);
        }

        Food food = FoodDatabase.getFoodByID(foodID);
        food.getPrice();

        orders.put(foodID, orderQuantity);

    }

}
