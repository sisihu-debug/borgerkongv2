package com.example.borgerkongv2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderCalculation {

    public static Double calculateOrder( HashMap<Integer,Integer> orders){
        Double totalAmount = 0.0;

        Iterator orderIterator = orders.entrySet().iterator();

        while (orderIterator.hasNext()) {
            Map.Entry<Integer, Integer> order = (Map.Entry) orderIterator.next();
            int id = order.getKey();
            int quantity = order.getValue();

            totalAmount += FoodDatabase.getFoodByID(id).getPrice() * quantity;

        }

        return totalAmount;

    }
}
