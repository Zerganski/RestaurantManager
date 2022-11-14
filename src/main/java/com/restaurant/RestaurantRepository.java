package com.restaurant;
import java.util.HashSet;
import java.util.Set;

public class RestaurantRepository {

    private final Set<Restaurant> restaurants = new HashSet<>(Set.of(new Restaurant("Kebab u Grubego", "Mokra 13", "TURKISH ", 1,
            new HashSet<>(Set.of(new Meal("Kebab", "24.00")))),
                new Restaurant("Pierogi", "Sucha 13", "SLAVIC ", 2,
                        new HashSet<>(Set.of(new Meal("Pierogi z Grzybami", "12.00"))))));
    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }
    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void deleteRestaurant(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }
}
