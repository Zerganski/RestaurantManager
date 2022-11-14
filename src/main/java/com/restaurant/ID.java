package com.restaurant;

public class ID {
    private long idCounter = 3;

    String createID() {
        return String.valueOf(idCounter++);
    }
}
