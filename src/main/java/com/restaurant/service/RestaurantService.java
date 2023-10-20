package com.restaurant.service;

import com.restaurant.model.Chef;
import com.restaurant.model.HeadChef;
import com.restaurant.model.Meal;

import java.util.UUID;

public interface RestaurantService {
    void displayHeadChefs(UUID id);

    void addMeal(Meal meal, UUID restaurantId);

    void changeRestaurantName(UUID restaurantId, String newName);

    void changeChefName(UUID restaurantId, UUID chefId, String newChefFirstName, String newChefLastName);

    void changeHeadChefName(UUID restaurantId, UUID chefId, String newChefFirstName, String newChefLastName);

    void displayMeals(UUID id);

    void displayRestaurants();

    void addMeal(String name, String price, UUID id);

    void exitProgram(String input);

    void displayChefs(UUID id);

    void addChef(Chef chef, UUID id);

    void addHeadChef(HeadChef headChef, UUID id);

    void addRestaurant(String name, String address, String type, UUID id);
}
