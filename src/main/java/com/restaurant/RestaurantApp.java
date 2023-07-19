package com.restaurant;

public class RestaurantApp {

    public static void main(String[] args) {
        final var restaurantRepository = new RestaurantRepository();
        new RestaurantProcessor(restaurantRepository).process();
    }

}
