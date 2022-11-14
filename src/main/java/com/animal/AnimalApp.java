package com.animal;
import java.util.Scanner;
public class AnimalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AnimalFactory animal = new AnimalFactory();
        System.out.print("Which animal specie would you like to get information of?: \n 1. Lobster \n 2. Bear \n 3. Hawk \n Your input: ");
        int answer = in.nextInt();
        Animal a = switch (answer) {
        case 1 -> animal.lobster();
        case 2 -> animal.bear();
        case 3 -> animal.hawk();
            default -> throw new IllegalStateException("Unexpected value: " + answer);

        };a.print();
    }
}



