package com.animal;

public class AnimalFactory {
    public Animal bear() {
        return new Bear("Bear grizzly", "Fat but fast", "Mammal", 36);
    }
    public Animal hawk() {
        return new Hawk("Hawk", "Speedy boi", "Bird", 36);
    }
    public Animal lobster() {
        return new Lobster("Lobster", "Can pack a punch", "arthropod", 136);

    }

}
