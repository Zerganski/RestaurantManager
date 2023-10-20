package com.restaurant.model;


import java.util.UUID;

public class Chef {
    private String firstName;
    private String lastName;
    private final java.util.UUID id;

    public Chef(String firstName, String lastName, UUID id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getId() {
        return id;
    }

    public void setChefFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setChefLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return " name: " + firstName + " " + lastName + ", ID: " + id;
    }

}


