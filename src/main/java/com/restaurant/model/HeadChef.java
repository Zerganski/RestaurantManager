package com.restaurant.model;

import java.util.UUID;

public class HeadChef extends Chef {
    private String firstName;
    private  String lastName;
    private  java.util.UUID id;


    public HeadChef(String firstName, String lastName, UUID id) {
        super(firstName, lastName, id);
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
    public void setHeadChefFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeadChefLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return " name: " + firstName + lastName + ", ID: " + id;
    }
}
