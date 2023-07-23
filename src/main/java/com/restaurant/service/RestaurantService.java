package com.restaurant.service;

import com.restaurant.model.Meal;

import java.util.UUID;

public interface RestaurantService {
    void addMeal(Meal meal, UUID restaurantId);
    void serviceDisplayMeals();
    void serviceAddMeal();
    void serviceChangeRestaurantName();
    void serviceExitProgram();
    void serviceAddRestaurant();
    void serviceDisplayRestaurants();
}
