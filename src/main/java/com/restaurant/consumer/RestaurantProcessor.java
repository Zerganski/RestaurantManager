package com.restaurant.consumer;

import com.restaurant.service.RestaurantServiceImpl;
import com.restaurant.storage.RestaurantRepository;

import java.util.Scanner;

public class RestaurantProcessor {
    static RestaurantServiceImpl service = new RestaurantServiceImpl(new RestaurantRepository());
    public RestaurantProcessor(RestaurantRepository restaurantRepository) {      // 7-10 pole obiektu
    }
    void process() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        while (!exit) {
            System.out.println("What kind of action would you like to perform: ");
            System.out.println("1. Add a restaurant");
            System.out.println("2. Add a meal to restaurant ");
            System.out.println("3. Display all restaurants ");
            System.out.println("4. Display all meals in a particular restaurant ");
            System.out.println("5. Change name of a particular restaurant ");
            System.out.println("6. Exit ");
            int menu = in.nextInt();
            switch (menu) {
                case 1 -> addRestaurant();
                case 2 -> addMeal();
                case 3 -> displayRestaurants();
                case 4 -> displayMeals();
                case 5 -> changeRestaurantName();
                case 6 -> exitProgram();
            }
        }
    }

    private void addRestaurant() {
        service.serviceAddRestaurant();
    }
    private void addMeal() {
        service.serviceAddMeal();
    }
    private void displayRestaurants() {
        service.serviceDisplayRestaurants();
    }
    public void displayMeals() {
        service.serviceDisplayMeals();
    }
    private void changeRestaurantName() {
        service.serviceChangeRestaurantName();
    }
    private void exitProgram() {
        service.serviceExitProgram();
    }
}