package com.restaurant;

import java.util.Scanner;

public class RestaurantProcessor {
    private RestaurantRepository restaurantRepository;
    private Scanner scanner;

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
                case 3 -> System.out.println(restaurantRepository.getRestaurants().toString());
                case 4 -> System.out.println();
                case 6 -> exit = true;
 //               case 7 -> restaurantRepository.deleteRestaurant();
            }
        }
    }

    private void addRestaurant() {
        ID id = new ID(); // deklaracja zmiennej lokalnej id typu ID oraz inicjalizacje poprzez uzycie konstruktora bezparametrowego klasy id
        System.out.println("Enter name of the restaurant: "); // wywołanie metody printLn pola klasy .out z parametrem typu String o wartosci "enter name of the restaurant:"
        String name = scanner.nextLine(); // deklaracja zmiennej lokalnej o nazwie name typu stirgn oraz inicnjalizacja jej poprzez przypisanei jej wartosci wywołania metody nextLine obiektu skaner
        System.out.println("Enter address of the restaurant: ");
        String address = scanner.nextLine();
        System.out.println("Enter type of the restaurant: ");
        String type = scanner.nextLine();
        int restaurantID = Integer.parseInt(id.createID());
        restaurantRepository.addRestaurant(new Restaurant(name, address, type, restaurantID));
    }
    private void deleteRestaurant(){
        System.out.println("Which restaurant would you like to delete?");

    }
}

