package com.example.homeworktask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }

    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();
    static {
        foods.put(1, new Food(
                1,
                "Big Bopper",
                "5.99",
                "A big beef burger with two patties, lettuce, pickles, onions, cheese and secret sauce.",
                R.drawable.bigbopper

                ));
        foods.put(2, new Food(
                2,
                "Cheesy Bopper.",
                "3.50",
                "A small beef burger with one patty, pickles, cheese, lettuce, mustard and tomato.",
                R.drawable.cheesybopper

        ));
        foods.put(3, new Food(
                3,
                "Small Fries",
                "0.99",
                "A small packet of French Fries with salt.",
                R.drawable.smallfries

        ));
        foods.put(4, new Food(
                4,
                "Medium Fries",
                "1.50",
                "A medium packet of French Fries with more salt.",
                R.drawable.mediumfries
        ));
        foods.put(5, new Food(
                5,
                "Large Fries",
                "49.99",
                "A truckload of French Fries with an ocean's worth of salt.",
                R.drawable.largefries
        ));
        foods.put(6, new Food(
                6,
                "Chocolate Shake",
                "3.99",
                "Milkshake with ice cream, whipped cream, full cream milk and creamy milk chocolate.",
                R.drawable.chocolatemilkshake
        ));
        foods.put(7, new Food(
                7,
                "Strawberry Shake",
                "3.99",
                "Milkshake with ice cream, whipped cream, full cream milk and sweet strawberry syrup.",
                R.drawable.strawberrymilkshake
        ));
        foods.put(8, new Food(
                8,
                "Chicken Borger",
                "4.99",
                "A crispy chicken fillet in a burger with lettuce, mayonaise and cheese.",
                R.drawable.chickenborger
        ));
        foods.put(9, new Food (
                9,
                "Fishy Boi Borger",
                "4.99",
                "A crispy fish pallette with mayonaise in a burger.",
                R.drawable.fishyboiborger
        ));
        foods.put(10, new Food (
                10,
                "Chicken Wrop",
                "4.50",
                "A crispy chicken strip in a wholemeal wrap with lettuce and mayonaise.",
                R.drawable.chickenwrop
        ));
        foods.put(11, new Food (
                11,
                "Apple Pie",
                "2.99",
                "Hot apple pie!",
                R.drawable.applepie
        ));
        foods.put(12, new Food (
                12,
                "Orange Juice",
                "0.99",
                "Fresh orange juice squeezed daily.",
                R.drawable.orangejuice
        ));
        foods.put(13, new Food (
                13,
                "Chicken Nogget",
                "3.99",
                "6 bite-sized fried chicken nuggets.",
                R.drawable.chickennogget
        ));
        foods.put(14, new Food (
                14,
                "Vanilla Ice Cream",
                "1.99",
                "Soft-served vanilla ice cream with chocolate garnish.",
                R.drawable.vanillaicecream
        ));
        foods.put(15, new Food (
                15,
                "Hash Brown",
                "0.50",
                "A small pocket of happiness.",
                R.drawable.hashbrown
        ));
    }

}

