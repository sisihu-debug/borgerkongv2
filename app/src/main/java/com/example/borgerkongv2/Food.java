package com.example.borgerkongv2;

import java.math.BigDecimal;

public class Food {

    //unique identifier of food item

    private int foodID;

    //Food Name

    private String name;

    //Food price

    private Double price;

    //Food description

    private String description;

    //Food picture

    private int imageDrawableId;

    public Food (int foodID, String name, Double price, String description, int imageDrawableId){
        this.foodID = foodID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageDrawableId = imageDrawableId;



    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getName() {
        return name;
    }

    public void setName(String headline) {
        this.name = headline;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(String author) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String summary) {
        this.description = summary;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

}
