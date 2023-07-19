package com.restaurant.service;

import com.restaurant.model.Meal;

import java.util.UUID;

public interface RestaurantService {
    void addMeal(Meal meal, UUID restaurantId);
}
