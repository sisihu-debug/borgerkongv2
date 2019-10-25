package com.example.borgerkongv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderDatabase {

    //instantiate a hashmap to present the Food ID and quantity of food

    public static final HashMap<Integer, Integer> orders = new HashMap<>();

    public static HashMap<Integer, Integer> getOrders (HashMap <Integer, Integer> orders){
        return orders;
    }

    //if food already exists, simply add the quantity to existing quantity, if it doesn't exist, add it to the hashmap as a new order
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

    public static ArrayList<Order> getAllOrders() {


        ArrayList<Order> newOrdersArrayList = new ArrayList<>();

        //returns all the orders as an arraylist from a hashmap to be passed to the adapter

        Iterator orderIterator = orders.entrySet().iterator();
        while (orderIterator.hasNext()) {
            Map.Entry<Integer, Integer> order = (Map.Entry) orderIterator.next();

            newOrdersArrayList.add(new Order(order.getKey(),order.getValue()));







        }


        return newOrdersArrayList;





        //return new ArrayList<Order>((List) Arrays.asList(listOfOrderFoodID.toArray()));

        //order class quantity and food id
        //coonvert hashmap to order items

        //converts hashmap of orders to arraylist as orders, and then multiply by price

        //arraylist new order add these food items, arraylist.add()
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
