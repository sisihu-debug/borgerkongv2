package com.example.borgerkongv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static Food getFoodByID(int foodID) {
        return food.get(foodID);
    }

    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));

        //converts hashmap of orders to arraylist as orders, and then multiply by price
    }

    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {
        food.put(1, new Food(
                1,
                "Whopper",
                9.00,
                "Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun." ,

                R.drawable.whopper
        ));
        food.put(2, new Food(
                2,
                "Cheeseburger",
                5.00,
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                R.drawable.cheeseburger
        ));

        food.put(3, new Food(
                3,
                "Quarter Pound King",
                8.00,
                "Our Quarter Pound KING™ Sandwich has over ¼ lb.* of flame-grilled 100% beef, topped with all of our classic favorites: American cheese, freshly sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame seed bun.",
                R.drawable.quarterpound
        ));

        food.put(4, new Food(
                4,
                "Garden Salad",
                3.00,
                "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. Nutrition Information does not reflect home-style croutons or KEN’S salad dressing.",
                R.drawable.gardensidesalad
        ));

        food.put(5, new Food(
                5,
                "Chicken Salad",
                11.00,
                "Our Chicken Garden Salad is a mix of crisp green romaine, green leaf and radicchio lettuce, juicy-ripened tomatoes, buttery garlic croutons, and shredded cheddar cheese."
                        ,
                R.drawable.chickensalad
        ));

        food.put(6, new Food(
                6,
                "Frozen Coke",
                1.00,
                "Cool down with a Frozen Coke® any time of the year",
                R.drawable.frozencoke
        ));

        food.put(7, new Food(
                7,
                "Sprite",
                2.50,
                "Let Sprite® refresh your day with the great taste of lemon-lime."
                        ,

                R.drawable.sprite
        ));

        food.put(8, new Food(
                8,
                "Choc Milk",
                4.00,
                "Velvety Low Fat Chocolate Milk delivers wholesome sweetness and is packed with Calcium.",
                R.drawable.chocmilk
        ));

        food.put(9, new Food(
                9,
                "Chicken Nuggets",
                10.00,
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                R.drawable.chickennuggets
        ));

        food.put(10, new Food(
                10,
                "French Fries",
                2.00,
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",

                R.drawable.fries
        ));

        food.put(11, new Food(
                11,
                "Onion Rings",
                2.00,
                "Served hot and crispy, our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces.",

                R.drawable.onionrings
        ));

        food.put(12, new Food(
                12 ,
                "Cheesy Tots",
                4.00,
                "Melted cheese potato bites covered in a crunchy bread crumb coating. Served hot and crispy with your order.",

                R.drawable.cheesytots
        ));

        food.put(13, new Food(
                13,
                "Soft Serve",
                0.70,
                "We didn’t invent soft serve, but with one taste of our cool, creamy, and velvety Vanilla Soft Serve, you’ll think we perfected it. Your choice of classic cone or cup."
                        ,
                R.drawable.softserve

        ));

        food.put(14, new Food(
                14,
                "Choc Chip Cookie",
                5.00,
                "Our delicious Chocolate Chip Cookie is loaded with melty chocolate chips and baked to perfection.",
                R.drawable.chocchipcookie
        ));

        food.put(15, new Food(
                15,
                "Milkshake",
                6.00,
                "Cool down with our creamy Strawberry Hand Spun Shake. Velvety vanilla soft serve and strawberry sauce are blended to perfection and finished with sweet whipped topping just for you.",
                R.drawable.milkshake
        ));
    }
}
