package com.restaurant.consumer;

import com.restaurant.storage.RestaurantRepository;

public class RestaurantApp {

    public static void main(String[] args) {
        final var restaurantRepository = new RestaurantRepository();
        new RestaurantProcessor(restaurantRepository).process();
    }

}
