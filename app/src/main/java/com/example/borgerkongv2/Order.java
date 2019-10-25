package com.example.borgerkongv2;

public class Order {

    private int foodID;
    private int orderQuantity;


    public Order (Integer foodID, Integer orderQuantity){
        this.foodID = foodID;
        this.orderQuantity = orderQuantity;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public int getOrderQuantity(){return orderQuantity;}

    public void setOrderQuantity(int orderQuantity){this.orderQuantity = orderQuantity;}



}
