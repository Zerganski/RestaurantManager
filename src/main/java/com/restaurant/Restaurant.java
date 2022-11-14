package com.restaurant;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    public Set<Meal> meals = new HashSet<>();   //1 pola 2. konstr. 3 metody
    private String name;
    private String address;
    private String type;
    private int restaurantId;

    public Restaurant(String name, String address, String type, int restaurantId, Set<Meal> meals) { //shift f6
        this.name = name;
        this.address = address;
        this.type = type;
        this.restaurantId = restaurantId;
        this.meals = meals;
    }

    public Restaurant(String name, String address, String type, int restaurantId) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        if (meals.isEmpty()) {
            return "ID: " + restaurantId + ", name: " + name + ", address: " + address + ", type: " + type + "\n";
        }
        return "ID: " + restaurantId + ", name: " + name + ", address: " + address + ", type: " + type + "Meals" + meals + "\n";
    }

}
