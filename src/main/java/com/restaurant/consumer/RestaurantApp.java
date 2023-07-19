package com.restaurant.consumer;

import com.restaurant.storage.RestaurantRepository;

/*
Restaurant manager:
2. Create a console restaurant system, which allows you to create a new restaurant and meal for a particular restaurant.
The restaurant should contain id, name, address, type, Meal should have name, price and id.
Ids are assigned by the program during entity creation. Initially create a structure containing 3 restaurants with data, data should be available from the program start:
Kebab u grubego; Warszawska 11, Kraków 31-222; TURKISH
Milano Pizza; Sobczyka 12/3, Warszawa 33-312; ITALIAN
Meat Burger; Lipowa 31b/1 Gdańsk 18-111; AMERICAN

For program execution use IntellIJ (run or debug program):
At the beginning the program prints instructions, after each point user input is expected.
If you want to exit, type “exit”
If you want to create a restaurant, type “1”, if the user chooses this flow, then
Type restaurant name
Type restaurant address
Type restaurant type[ASIAN, ITALIAN, FRENCH, AMERICAN, TURKISH], nice to have - validation for those values
Show restaurant information is added with the restaurant id(which may be important later)
If you want to add a meal to a restaurant, type “2”, if the user chooses this flow, then
Type meal name
Type meal price
Type restaurant id to add the meal to a particular restaurant(most likely the user needs to print all available restaurants previously)
If user types “3” Show all restaurants, if user chooses this flow, then all restaurants should be printed
If the user types “4”,  shows all meals in a particular restaurant , if the user chooses this flow, then:
Type restaurant id(should be shown in restaurant print),
All meals of a specific restaurant should be printed
If a user types “5”, he should changes the restaurant name to the restaurant he chooses using id.
 */
public class RestaurantApp {

    public static void main(String[] args) {
        final var restaurantRepository = new RestaurantRepository();
        new RestaurantProcessor(restaurantRepository).process();
    }
}
