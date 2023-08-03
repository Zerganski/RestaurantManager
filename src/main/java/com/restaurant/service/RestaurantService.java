package com.restaurant.service;

import com.restaurant.model.Meal;

import java.util.UUID;

public interface RestaurantService {
    void addMeal(Meal meal, UUID restaurantId);

    void changeRestaurantName(UUID restaurantId, String newName);

    void displayMeals(UUID id);

    void displayRestaurants();

    void addMeal(String name, String price, UUID id);

    void exitProgram(String input);

    void addRestaurant(String name, String address, String type, UUID id);
}
