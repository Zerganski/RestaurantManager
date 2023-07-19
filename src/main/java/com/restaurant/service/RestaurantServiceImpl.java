package com.restaurant.service;

import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;
import com.restaurant.storage.RestaurantRepository;

import java.util.Optional;
import java.util.UUID;

public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    public RestaurantRepository getRestaurantRepository() {
        return restaurantRepository;
    }
    @Override
    public void addMeal(Meal meal, UUID restaurantId) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.getRestaurants().stream()
                .filter(restaurant -> restaurant.getId().equals(restaurantId))
                .findFirst();

        restaurantOptional.ifPresentOrElse(
                restaurant -> restaurant.addMeal(meal),
                () -> System.out.println("Restaurant not found.")
        );
    }

}

