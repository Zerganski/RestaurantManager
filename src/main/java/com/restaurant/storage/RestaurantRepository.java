package com.restaurant.storage;

import com.restaurant.model.Meal;
import com.restaurant.model.Restaurant;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class RestaurantRepository {

    private final Set<Restaurant> restaurants = new HashSet<>(Set.of(
            new Restaurant("Kebab u Grubego", "Mokra 13, Krakow 31-222", "TURKISH ", UUID.randomUUID(),
                    new HashSet<>(Set.of(
                            new Meal("Kebab", "24.00"),
                            new Meal("Falafel", "18.00"),
                            new Meal("Baklava", "8.50")
                    ))
            ),
            new Restaurant("Milano Pizza", "Sobczyka 12/3, Warszawa 33-312", "ITALIAN ", UUID.randomUUID(),
                    new HashSet<>(Set.of(
                            new Meal("Margherita", "15.00"),
                            new Meal("Pepperoni", "18.50"),
                            new Meal("Carbonara", "20.00")
                    ))
            ),
            new Restaurant("Meat Burger", "Lipowa 31b/1 Gdansk 18-111", "AMERICAN ", UUID.randomUUID(),
                    new HashSet<>(Set.of(
                            new Meal("Classic Burger", "12.00"),
                            new Meal("BBQ Bacon Burger", "14.50"),
                            new Meal("Mushroom Swiss Burger", "13.50")
                    ))
            )
    ));

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

}
