package com.restaurant.service;

import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;
import com.restaurant.storage.RestaurantRepository;

import java.util.Optional;
import java.util.UUID;
import java.util.Scanner;

public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final Scanner scanner;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
        this.scanner = new Scanner(System.in);
    }

    public RestaurantRepository getRestaurantRepository() {
        return restaurantRepository;
    }

    @Override
    public void DisplayRestaurants() {
        System.out.println(getRestaurantRepository().getRestaurants().toString());
    }

    @Override
    public void AddMeal(String name, String price, UUID id) {
        Meal meal = new Meal(name, price);
        addMeal(meal, id);
    }

    @Override
    public void serviceExitProgram(String input) {
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Closing the program...");
            System.exit(0);
        } else {
            System.out.println("Nuh uh, this in not 'exit'");
        }
    }

    @Override
    public void ChangeRestaurantName(UUID restaurantId, String newName) {
        Optional<Restaurant> chosenRestaurant = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(restaurant -> restaurant.getId().equals(restaurantId))
                .findFirst();

        if (chosenRestaurant.isPresent()) {
            chosenRestaurant.get().setName(newName);
            System.out.println("Restaurant name has been updated.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    @Override
    public void DisplayMeals(UUID id) {
        Optional<Restaurant> restaurantOptional = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(r -> r.getId().equals(id) && !r.getMeals().isEmpty())
                .findFirst();

        if (restaurantOptional.isPresent()) {
            Restaurant r = restaurantOptional.get();
            System.out.println("Meals for " + r.getName() + ":");
            r.getMeals().forEach(meal -> System.out.println(meal.getName() + " (" + meal.getPrice() + " PLN)"));
        } else {
            System.out.println("Restaurant not found or has no meals.");
        }
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

    @Override
    public void addRestaurant(String name, String address, String type, UUID id) {
        getRestaurantRepository().addRestaurant(new Restaurant(name, address, type, id));
    }

}

