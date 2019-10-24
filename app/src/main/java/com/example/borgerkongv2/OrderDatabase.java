package com.example.borgerkongv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OrderDatabase {

//    public static OrderDatabase getFoodByID(int foodID) {
//        return OrderDatabase.get(foodID);
//    }

//    public static ArrayList<Food> getAllFood() {
//        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));

        //converts hashmap of orders to arraylist as orders, and then multiply by price
   // }

    public static final HashMap<Integer, Integer> orders = new HashMap<>();

    public static HashMap<Integer, Integer> getOrders (HashMap <Integer, Integer> orders){
        return orders;
    }

    public static void addToOrder(int foodID, int orderQuantity){
        if (orders.containsKey(foodID)){
            int prevOrderQuantity = orders.get(foodID);
            orders.put(foodID, prevOrderQuantity + orderQuantity);
        } else{
            orders.put(foodID, orderQuantity);
        }

        Food food = FoodDatabase.getFoodByID(foodID);
        food.getPrice();



    }

//    public static double calculateOrder( HashMap<Integer,Integer> orders){
//        double totalAmount;
//
//        Iterator orderIterator = orders.entrySet().iterator();
//
//        while (orderIterator.hasNext()) {
//            Map.Entry<Integer, Integer> order = (Map.Entry) orderIterator.next();
//            int id = order.getKey();
//            int quantity = order.getValue();
//
//            totalAmount =+ FoodDatabase.getFoodByID(id).getPrice() * quantity;
//
//        }
//
//        return totalAmount;
//
//
////for loops dont work for hashmaps
//
//
////        for( int x = 0; x <= orders.size(); x++){
////            Food food = FoodDatabase.getFoodByID(foodID);
////            Double foodItemPrice = food.getPrice();
////            int foodQuantity = orders.get(foodID);
////
////
////        }
//
//
//
//
//    }

}
