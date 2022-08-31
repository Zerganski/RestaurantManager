package com.helloworld;

import java.util.Scanner;

public class RestaurantApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Function which reads user input
        System.out.println("Enter your name");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }
}
