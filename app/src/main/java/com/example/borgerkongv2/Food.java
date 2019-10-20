package com.example.borgerkongv2;

import java.math.BigDecimal;

public class Food {

    //unique identifier of food item

    private int foodID;

    //Food Name

    private String name;

    //Food price

    private BigDecimal price;

    //Food description

    private String description;

    //Food picture

    private int imageDrawableId;

    public Food (int foodID, String name, BigDecimal price, String description, int imageDrawableId){
        this.foodID = foodID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageDrawableId = imageDrawableId;

        this.imageDrawableId = imageDrawableId;

    }

}
