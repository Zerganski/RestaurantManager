package com.restaurant.consumer;

import com.restaurant.service.RestaurantServiceImpl;
import com.restaurant.storage.RestaurantRepository;

import java.util.Scanner;
import java.util.UUID;

public class RestaurantProcessor {
    private final Scanner scanner;
    static RestaurantServiceImpl service = new RestaurantServiceImpl(new RestaurantRepository());

    public RestaurantProcessor(RestaurantRepository restaurantRepository) {      // 7-10 pole obiektu
        this.scanner = new Scanner(System.in);
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
        try {
            UUID id = UUID.randomUUID();
            System.out.println("Enter name of the restaurant: ");
            String name = scanner.nextLine();
            System.out.println("Enter address of the restaurant: ");
            String address = scanner.nextLine();
            System.out.println("Enter type of the restaurant: ");
            String type = scanner.nextLine();
            service.addRestaurant(name, address, type, id);
            System.out.println("Restaurants UUID: " + id);
        } catch (IllegalArgumentException e) {
            System.out.println("Restaurant was not added.");
        }
    }

    private void addMeal() {
        try {
            System.out.println("Enter name of the meal: ");
            String name = scanner.nextLine();
            System.out.println("Enter price of the meal: ");
            String price = scanner.nextLine();
            System.out.println("Enter UUID of the restaurant: ");
            UUID id = UUID.fromString(scanner.nextLine());
            service.addMeal(name, price, id);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid UUID format. Meal was not added.");
        }
    }

    private void displayRestaurants() {
        try {
            service.displayRestaurants();
        } catch (Exception e) {
            System.out.println("An error occurred while displaying restaurants: ");
        }
    }

    public void displayMeals() {
        System.out.println("Which restaurant meals would you like to see? (input UUID)");
        try {
            UUID id = UUID.fromString(scanner.nextLine());
            service.displayMeals(id);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid UUID format. Please enter a valid UUID.");
        }
    }

    private void changeRestaurantName() {
        try {
            System.out.println("Enter the UUID of the restaurant: ");
            UUID restaurantId = UUID.fromString(scanner.nextLine());
            System.out.println("Enter the new name for the restaurant: ");
            String newName = scanner.nextLine();
            service.changeRestaurantName(restaurantId, newName);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid UUID format. Please enter a valid UUID.");
        }
    }

    private void exitProgram() {
        try {
            System.out.println("Type 'exit' to close the program ");
            String input = scanner.nextLine();
            service.exitProgram(input);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Nuh uh, this is not 'exit'");
        }
    }
}