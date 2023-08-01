package com.restaurant.service;

import com.restaurant.model.Meal;

import java.util.UUID;

public interface RestaurantService {
    void addMeal(Meal meal, UUID restaurantId);

    void ChangeRestaurantName(UUID restaurantId, String newName);

    void DisplayMeals(UUID id);

    void DisplayRestaurants();

    void AddMeal(String name, String price, UUID id);

    void ExitProgram(String input);

    void addRestaurant(String name, String address, String type, UUID id);
}
