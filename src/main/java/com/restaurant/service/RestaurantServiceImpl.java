package com.restaurant.service;

import com.restaurant.model.Chef;
import com.restaurant.model.HeadChef;
import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;
import com.restaurant.storage.RestaurantRepository;

import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

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
    public void displayRestaurants() {
        System.out.println(getRestaurantRepository().getRestaurants().toString());
    }


    @Override
    public void addMeal(String name, String price, UUID id) {
        Meal meal = new Meal(name, price);
        addMeal(meal, id);
    }

    @Override
    public void exitProgram(String input) {
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Closing the program...");
            System.exit(0);
        } else {
            System.out.println("Nuh uh, this in not 'exit'");
        }
    }

    @Override
    public void changeRestaurantName(UUID restaurantId, String newName) {
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
    public void changeChefName(UUID restaurantId, UUID chefId, String newChefFirstName, String newChefLastName) {
        Optional<Restaurant> chosenRestaurant = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(restaurant -> restaurant.getId().equals(restaurantId))
                .findFirst();

        if (chosenRestaurant.isPresent()) {
            Restaurant restaurant = chosenRestaurant.get();
            Set<Chef> chefs = restaurant.getChefs();

            chefs.forEach(chef -> {
                if (chef.getId().equals(chefId)) {
                    chef.setChefFirstName(newChefFirstName);
                    chef.setChefLastName(newChefLastName);
                }
            });

            System.out.println("Chef name has been updated.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    @Override
    public void changeHeadChefName(UUID restaurantId, UUID headChefId, String newHeadChefFirstName, String newHeadChefLastName) {
        Optional<Restaurant> chosenRestaurant = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(restaurant -> restaurant.getId().equals(restaurantId))
                .findFirst();

        if (chosenRestaurant.isPresent()) {
            Restaurant restaurant = chosenRestaurant.get();
            Set<HeadChef> headChefs = restaurant.getHeadChefs();

            headChefs.forEach(headChef -> {
                if (headChef.getId().equals(headChefId)) {
                    headChef.setHeadChefFirstName(newHeadChefFirstName);
                    headChef.setHeadChefLastName(newHeadChefLastName);
                }
            });

            System.out.println("Head Chef name has been updated.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    @Override
    public void displayMeals(UUID id) {
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
    public void displayChefs(UUID id) {
        Optional<Restaurant> restaurantOptional = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(r -> r.getId().equals(id) && !r.getChefs().isEmpty())
                .findFirst();

        if (restaurantOptional.isPresent()) {
            Restaurant r = restaurantOptional.get();
            System.out.println("Chefs for " + r.getName() + ":");
            r.getChefs().forEach(chef -> System.out.println("Name: " + chef.getFirstName() + " " + chef.getLastName() + ", Chefs ID:" + chef.getId()));
        } else {
            System.out.println("Restaurant not found or has no chefs.");
        }
    }

    @Override
    public void displayHeadChefs(UUID id) {
        Optional<Restaurant> restaurantOptional = getRestaurantRepository().getRestaurants()
                .stream()
                .filter(r -> r.getId().equals(id) && !r.getHeadChefs().isEmpty())
                .findFirst();

        if (restaurantOptional.isPresent()) {
            Restaurant r = restaurantOptional.get();
            System.out.println("Head Chefs for " + r.getName() + ":");
            r.getHeadChefs().forEach(headChef -> System.out.println("Name: " + headChef.getFirstName() + " " + headChef.getLastName() + ", Head Chefs ID:" + headChef.getId()));
        } else {
            System.out.println("Restaurant not found or has no chefs.");
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
    public void addChef(Chef chef, UUID id) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.getRestaurants().stream()
                .filter(restaurant -> restaurant.getId().equals(id))
                .findFirst();

        restaurantOptional.ifPresentOrElse(
                restaurant -> restaurant.addChef(chef),
                () -> System.out.println("Restaurant not found.")
        );

    }

    @Override
    public void addHeadChef(HeadChef headChef, UUID id) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.getRestaurants().stream()
                .filter(restaurant -> restaurant.getId().equals(id))
                .findFirst();

        restaurantOptional.ifPresentOrElse(
                restaurant -> restaurant.addHeadChef(headChef),
                () -> System.out.println("Restaurant not found.")
        );

    }

    @Override
    public void addRestaurant(String name, String address, String type, UUID id) {
        getRestaurantRepository().addRestaurant(new Restaurant(name, address, type, id));
    }
    public void addChef(String firstName, String lastName, UUID id) {
        Chef chef = new Chef(firstName, lastName, id);
        addChef(chef, id);
    }

    public void addHeadChef(String firstName, String lastName, UUID id) {
        HeadChef headChef = new HeadChef(firstName, lastName, id);
        addHeadChef(headChef, id);
    }
}

