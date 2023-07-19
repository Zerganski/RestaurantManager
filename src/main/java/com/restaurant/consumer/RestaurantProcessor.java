package com.restaurant.consumer;

import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;
import com.restaurant.service.RestaurantServiceImpl;
import com.restaurant.storage.RestaurantRepository;

import java.util.Scanner;
import java.util.UUID;

public class RestaurantProcessor {
    private Scanner scanner;
    private RestaurantRepository restaurantRepository;
    static RestaurantServiceImpl service = new RestaurantServiceImpl(new RestaurantRepository());
    public RestaurantProcessor(RestaurantRepository restaurantRepository) {      // 7-10 pole obiektu
        this.restaurantRepository = restaurantRepository;
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
                case 3 -> System.out.println(service.getRestaurantRepository().getRestaurants().toString());
                case 4 -> displayMeals(restaurantRepository);
                case 5 -> changeRestaurantName();
                case 6 -> exitProgram();
                case 7 -> deleteRestaurant();
            }
        }
    }

    private void addRestaurant() {
        UUID id = UUID.randomUUID(); // deklaracja zmiennej lokalnej id typu ID oraz inicjalizacje poprzez uzycie konstruktora bezparametrowego klasy id
        System.out.println("Enter name of the restaurant: "); // wywołanie metody printLn pola klasy .out z parametrem typu String o wartosci "enter name of the restaurant:"
        String name = scanner.nextLine(); // deklaracja zmiennej lokalnej o nazwie name typu stirgn oraz inicnjalizacja jej poprzez przypisanei jej wartosci wywołania metody nextLine obiektu skaner
        System.out.println("Enter address of the restaurant: ");
        String address = scanner.nextLine();
        System.out.println("Enter type of the restaurant: ");
        String type = scanner.nextLine();
        restaurantRepository.addRestaurant(new Restaurant(name, address, type, id));
        System.out.println("Restaurants UUID: " + id);
    }

    private void deleteRestaurant() {
        System.out.println("Which restaurant would you like to delete?");
        UUID id = UUID.fromString(scanner.nextLine());
        Restaurant restaurantToDelete = null;
        for (Restaurant r : restaurantRepository.getRestaurants()) {
            if (r.getId().equals(id)) {
                restaurantToDelete = r;
            }
        }
        if (restaurantToDelete != null) {
            restaurantRepository.deleteRestaurant(restaurantToDelete);
        }
    }

    public void displayMeals(RestaurantRepository restaurantRepository) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which restaurant meals would you like to see? (input UUID)");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Restaurant r : service.getRestaurantRepository().getRestaurants()) {
            if (r.getId().equals(id)) {
                System.out.println("Meals for " + r.getName() + ":");
                for (Meal meal : r.getMeals()) {
                    System.out.println(meal.getName() + " (" + meal.getPrice() + " PLN)");
                }
                return;
            }
        }
        System.out.println("Restaurant not found.");
    }

    private void addMeal() {
        System.out.println("Enter name of the meal: ");
        String name = scanner.nextLine();
        System.out.println("Enter price of the meal: ");
        String price = scanner.nextLine();
        System.out.println("Enter UUID of the restaurant: "); //should be last
        UUID id = UUID.fromString(scanner.nextLine());
        Meal meal = new Meal(name, price);
        service.addMeal(meal, id);
    }
    private void changeRestaurantName() {
        System.out.println("Enter the UUID of the restaurant: ");
        UUID restaurantId = UUID.fromString(scanner.nextLine());
        System.out.println("Enter the new name for the restaurant: ");
        String newName = scanner.nextLine();

        Restaurant chosenRestaurant = null;
        for (Restaurant restaurant : restaurantRepository.getRestaurants()) {
            if (restaurant.getId().equals(restaurantId)) {
                chosenRestaurant = restaurant;
                break;
            }
        }

        if (chosenRestaurant != null) {
            chosenRestaurant.setName(newName);
            System.out.println("Restaurant name has been updated.");
        } else {
            System.out.println("Restaurant not found.");
        }
    }
    private void exitProgram() {
        System.out.println("Type 'exit' to close the program ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Closing the program...");
            System.exit(0);
        }
        else {
            System.out.println("Nuh uh, this in not 'exit'");
        }
    }
}