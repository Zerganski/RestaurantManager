package com.restaurant.model;

public class Meal {
    private String price;
    private String name;
    public Meal(String name, String price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return " name: " + name + ", price: " + price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
