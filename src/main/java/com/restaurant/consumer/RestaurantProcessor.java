package com.restaurant.consumer;

import com.restaurant.service.RestaurantServiceImpl;
import com.restaurant.storage.RestaurantRepository;

import java.util.Scanner;
import java.util.UUID;

public class RestaurantProcessor {
    static RestaurantServiceImpl service = new RestaurantServiceImpl(new RestaurantRepository());
    private final Scanner scanner;

    public RestaurantProcessor(RestaurantRepository restaurantRepository) {      // 7-10 pole obiektu
        this.scanner = new Scanner(System.in);
    }

    void process() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        while (!exit) {
            System.out.println("What kind of action would you like to perform: \n 1. Add a restaurant. \n 2. Add a meal to restaurant. \n 3. Add Chef to restaurant. \n 4. Add Head Chef to restaurant. \n 5. Display all restaurants. \n 6. Display all meals in a particular restaurant. \n 7. Display Chefs is a particular restaurant.\n 8. Display Head Chefs is a particular restaurant. \n 9. Change name of a particular restaurant. \n 10. Change name of a particular Chef in a particular Restaurant. \n 11. Change name of a particular Head Chef in a particular Restaurant. \n 12. Exit.");

            int menu = in.nextInt();
            switch (menu) {
                case 1 -> addRestaurant();
                case 2 -> addMeal();
                case 3 -> addChef();
                case 4 -> addHeadChef();
                case 5 -> displayRestaurants();
                case 6 -> displayMeals();
                case 7 -> displayChefs();
                case 8 -> displayHeadChefs();
                case 9 -> changeRestaurantName();
                case 10 -> changeChefName();
                case 11 -> changeHeadChefName();
                case 12 -> exitProgram();
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

    private void addChef() {
        try {
            System.out.println("Enter first name of the Chef: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name of the Chef: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter UUID of the restaurant: ");
            UUID id = UUID.fromString(scanner.nextLine());
            service.addChef(firstName, lastName, id);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid UUID format. Chef was not added.");
        }
    }

    private void addHeadChef() {
        try {
            System.out.println("Enter first name of the Head Chef: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name of the Head Chef: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter UUID of the restaurant: ");
            UUID id = UUID.fromString(scanner.nextLine());
            service.addHeadChef(firstName, lastName, id);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid UUID format. Head Chef was not added.");
        }
    }

    private void displayRestaurants() {
        try {
            service.displayRestaurants();
        } catch (Exception e) {
            System.out.println("An error occurred while displaying restaurants: ");
        }
    }

    private void displayChefs() {
        System.out.println("Which restaurant Chefs would you like to see? (input UUID)");
        try {
            UUID id = UUID.fromString(scanner.nextLine());
            service.displayChefs(id);
        } catch (Exception e) {
            System.out.println("An error occurred while displaying chefs: ");
        }
    }

    private void displayHeadChefs() {
        System.out.println("Which restaurant Head Chefs would you like to see? (input UUID)");
        try {
            UUID id = UUID.fromString(scanner.nextLine());
            service.displayHeadChefs(id);
        } catch (Exception e) {
            System.out.println("An error occurred while displaying chefs: ");
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

    private void changeChefName() {
        try {
            System.out.println("Enter the UUID of the restaurant: ");
            UUID id = UUID.fromString(scanner.nextLine());
            System.out.println("Enter the ID of the Chef: ");
            UUID chefId = UUID.fromString(scanner.nextLine());
            System.out.println("Enter the new first name of the Chef: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter the new last name of the Chef: ");
            String lastName = scanner.nextLine();
            service.changeChefName(id, chefId, firstName, lastName);
        } catch (IllegalArgumentException e) {
            System.out.println("There is no such restaurant or chef ID");
        }
    }
    public void changeHeadChefName() {
        try {
            System.out.println("Enter the UUID of the restaurant: ");
            UUID id = UUID.fromString(scanner.nextLine());
            System.out.println("Enter the ID of the Head Chef: ");
            UUID headChefId = UUID.fromString(scanner.nextLine());
            System.out.println("Enter the new first name of the Head Chef: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter the new last name of the Head Chef: ");
            String lastName = scanner.nextLine();
            service.changeHeadChefName(id, headChefId, firstName, lastName);
        } catch (IllegalArgumentException e) {
            System.out.println("There is no such restaurant or Head Chef ID");
        }
    }

    private void exitProgram() {
        try {
            System.out.println("Type 'exit' to close the program ");
            String input = scanner.nextLine();
            service.exitProgram(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Nuh uh, this is not 'exit'");
        }
    }
}