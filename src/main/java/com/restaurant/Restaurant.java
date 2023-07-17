package com.restaurant;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class Restaurant {

    //1 pola 2. konstr. 3 metody
    private UUID id; // identyfikator powinien byc pierwszy
    private String name;
    private String address;
    private String type;
    public Set<Meal> meals = new HashSet<>();

    public Restaurant(String name, String address, String type, UUID id, Set<Meal> meals) { //shift f6
        this.name = name;
        this.address = address;
        this.type = type;
        this.id = id;
        this.meals = meals;
    }

    public Restaurant(String name, String address, String type, UUID id) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    @Override
    public String toString() {
            return "ID: " + id + ", name: " + name + ", address: " + address + ", type: " + type + "\n";
    }

}
