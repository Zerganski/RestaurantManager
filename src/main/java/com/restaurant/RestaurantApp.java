package com.restaurant;

/*
1. Change name of project in GitHub - RestaurantManager, RestaurantApp.
   choose one which will fit good in your opinion, not restaurant-karol XD
2. Create a new branch, call it refactoring. You can't create commits in master branch - safety things.
   after refactoring stuff you should create a pull request and I will check your changes.
3. Create packages and move classes to new packages.
    model - Meal, Restaurant
    storage - RestaurantRepository
    consumer - RestaurantApp, RestaurantProcessor
4. Create a new service class (RestaurantServiceImpl) and move all methods from RestaurantRepository.
5. Create an interface for service class (RestaurantService)
6. Create a new package for service class and interface - call it service
6. Delete all unused methods and constructors.
 */
public class RestaurantApp {

    public static void main(String[] args) {
        final var restaurantRepository = new RestaurantRepository();
        new RestaurantProcessor(restaurantRepository).process();
    }
}
