package com.restaurant;

import java.util.Set;

public class Meal {
    private String price;
    private String name;
    public Meal(String name, String price) {
        this.name = name;
        this.price = price;
    }
    public Meal() {
    }

    public Meal(String name, String address, String type, int restaurantID) {
    }

    @Override
    public String toString() {
        return " meal name: " + name + ", meal price: " + price;
    }


}
