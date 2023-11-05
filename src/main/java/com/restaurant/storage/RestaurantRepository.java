package com.restaurant.storage;

import com.restaurant.model.Chef;
import com.restaurant.model.HeadChef;
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
                    )),
                    new HashSet<>(Set.of(
                            new Chef("Piotr", "Zaszczyński", UUID.randomUUID()),
                            new Chef("Jan", "Kowalski", UUID.randomUUID()),
                            new Chef("Janusz", "Nowak", UUID.randomUUID())
                    )),
                    new HashSet<>(Set.of(
                            new HeadChef("Dominika", "Sleziak", UUID.randomUUID()),
                            new HeadChef("Bronisława", "Lorens", UUID.randomUUID()),
                            new HeadChef("Mirosław", "Ciepły", UUID.randomUUID())
                    ))
            ),
            new Restaurant("Milano Pizza", "Sobczyka 12/3, Warszawa 33-312", "ITALIAN ", UUID.randomUUID(),
                    new HashSet<>(Set.of(
                            new Meal("Margherita", "15.00"),
                            new Meal("Pepperoni", "18.50"),
                            new Meal("Carbonara", "20.00")
                    )),
                    new HashSet<>(Set.of(
                            new Chef("Ernest", "Szymanski", UUID.randomUUID()),
                            new Chef("Jozef", "Kryger", UUID.randomUUID()),
                            new Chef("Aleks", "Hinc", UUID.randomUUID())
                    )),
                    new HashSet<>(Set.of(
                            new HeadChef("Sandra", "Zamojska", UUID.randomUUID()),
                            new HeadChef("Iwona", "Panasiewicz", UUID.randomUUID()),
                            new HeadChef("Kamil", "Grund", UUID.randomUUID())
                    ))
            ),
            new Restaurant("Meat Burger", "Lipowa 31b/1 Gdansk 18-111", "AMERICAN ", UUID.randomUUID(),
                    new HashSet<>(Set.of(
                            new Meal("Classic Burger", "12.00"),
                            new Meal("BBQ Bacon Burger", "14.50"),
                            new Meal("Mushroom Swiss Burger", "13.50")
                    )),
                    new HashSet<>(Set.of(
                            new Chef("Oktawian", "Kempa", UUID.randomUUID()),
                            new Chef("Ignacy", "Kozyra", UUID.randomUUID()),
                            new Chef("Gustaw", "Loza", UUID.randomUUID())
                    )),
                    new HashSet<>(Set.of(
                            new HeadChef("Sebastian", "Kadela", UUID.randomUUID()),
                            new HeadChef("Zbigniew", "Naumenko", UUID.randomUUID()),
                            new HeadChef("Aniela", "Dopierala", UUID.randomUUID())
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
