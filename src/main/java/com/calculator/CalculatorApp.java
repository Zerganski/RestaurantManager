package com.calculator;
// Operacje do dokonczenia, pytania = metoda process w klasie calculator metoda obiektu proces w klasie kalkulator
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner menuScan = new Scanner(System.in);
        while (!exit) {
            System.out.println("What do you want to do? \n Type calc to boot calculator \n Type exit to close program.");
            System.out.println("Insert choice: ");
            String menuChoice = menuScan.nextLine();
            switch (menuChoice) {
                case "calc" -> Calc();
                case "exit" -> exit = true;
 //               case "hist" -> System.out.println(calculationList.toString());
            }
        }
    }
    private static void Calc() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        while (!exit) {
            System.out.println("Type the first number: ");
            int firstNumber = Integer.parseInt(in.nextLine());
            System.out.println("Type the operator: ");
            String operation = in.nextLine();
            System.out.println("Type the second number: ");
            int secondNumber = Integer.parseInt(in.nextLine());
            switch (operation) {
                case "+" -> add(firstNumber, secondNumber);
                case "-" -> subtract(firstNumber, secondNumber);
                case "*" -> multiply(firstNumber, secondNumber);
                case "/" -> divide(firstNumber, secondNumber);
            }
            System.out.println("Next calculations? yes/no: ");
            String decision = in.nextLine();
            switch (decision) {
                case "yes": {
                    break;
                }
                case "no": {
                    exit = true;
                }
            }
        }
    }
    private static void add(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.add(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }
    private static void subtract(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }
    private static void multiply(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }
    private static void divide(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }
}