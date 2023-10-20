package com.restaurant.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class Restaurant {

    //1 pola 2. konstr. 3 metody
    private final UUID id; // identyfikator powinien byc pierwszy
    private final String address;
    private final String type;
    public Set<Meal> meals = new HashSet<>();
    public Set<Chef> chefs = new HashSet<>();
    public Set<HeadChef> headChefs = new HashSet<>();
    private String name;

    public Restaurant(String name, String address, String type, UUID id, Set<Meal> meals, Set<Chef> chefs, Set<HeadChef> headChefs) { //shift f6
        this.name = name;
        this.address = address;
        this.type = type;
        this.id = id;
        this.meals = meals;
        this.chefs = chefs;
        this.headChefs = headChefs;
    }

    public Restaurant(String name, String address, String type, UUID id) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void addHeadChef(HeadChef headChef) {
        headChefs.add(headChef);
    }

    public Set<Meal> getMeals() {
        return meals;
    }

    public Set<Chef> getChefs() {
        return chefs;
    }

    public Set<HeadChef> getHeadChefs() {
        return headChefs;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", name: " + name + ", address: " + address + ", type: " + type + "\n";
    }

}
