package com.restaurant.service;

import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;
import com.restaurant.storage.RestaurantRepository;

import java.util.Optional;
import java.util.UUID;
import java.util.Scanner;

public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private Scanner scanner;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
        this.scanner = new Scanner(System.in);
    }
    public RestaurantRepository getRestaurantRepository() {
        return restaurantRepository;
    }
    public void serviceDisplayRestaurants() {
        System.out.println(getRestaurantRepository().getRestaurants().toString());
    }
    public void serviceAddMeal() {
        System.out.println("Enter name of the meal: ");
        String name = scanner.nextLine();
        System.out.println("Enter price of the meal: ");
        String price = scanner.nextLine();
        System.out.println("Enter UUID of the restaurant: "); //should be last
        UUID id = UUID.fromString(scanner.nextLine());
        Meal meal = new Meal(name, price);
        addMeal(meal, id);
    }
    public void serviceAddRestaurant() {
        UUID id = UUID.randomUUID(); // deklaracja zmiennej lokalnej id typu ID oraz inicjalizacje poprzez uzycie konstruktora bezparametrowego klasy id
        System.out.println("Enter name of the restaurant: "); // wywołanie metody printLn pola klasy .out z parametrem typu String o wartosci "enter name of the restaurant:"
        String name = scanner.nextLine(); // deklaracja zmiennej lokalnej o nazwie name typu stirgn oraz inicnjalizacja jej poprzez przypisanei jej wartosci wywołania metody nextLine obiektu skaner
        System.out.println("Enter address of the restaurant: ");
        String address = scanner.nextLine();
        System.out.println("Enter type of the restaurant: ");
        String type = scanner.nextLine();
        getRestaurantRepository().addRestaurant(new Restaurant(name, address, type, id));
        System.out.println("Restaurants UUID: " + id);
    }
    public void serviceExitProgram() {
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
    public void serviceChangeRestaurantName() {
        System.out.println("Enter the UUID of the restaurant: ");
        UUID restaurantId = UUID.fromString(scanner.nextLine());
        System.out.println("Enter the new name for the restaurant: ");
        String newName = scanner.nextLine();

        Restaurant chosenRestaurant = null;
        for (Restaurant restaurant : getRestaurantRepository().getRestaurants()) {
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
    public void serviceDisplayMeals(){
        System.out.println("Which restaurant meals would you like to see? (input UUID)");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Restaurant r : getRestaurantRepository().getRestaurants()) {
            if (r.getId().equals(id) && !r.getMeals().isEmpty()) {
                System.out.println("Meals for " + r.getName() + ":");
                for (Meal meal : r.getMeals()) {
                    System.out.println(meal.getName() + " (" + meal.getPrice() + " PLN)");
                }
                return;
            }
            else if(r.getMeals().isEmpty()) {
                System.out.println("Restaurant not found or has no meals.");
            }
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

}

