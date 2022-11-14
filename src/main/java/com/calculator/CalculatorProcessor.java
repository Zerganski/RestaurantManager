package com.calculator;
import java.util.Scanner;

/*
ZROZUMIEC PROBLEM

ZNALEZC ROZWIAZANIE PROBLEMU

NAPISAC KOD
*/
public class CalculatorProcessor {
    private CalculatorHistory calculatorHistory = new CalculatorHistory();
    int add(int first, int second) { //method
        return first + second;
    }
    int subtract(int first, int second){ //method
        return first - second;
    }
    int divide(int first, int second){ //method
        return first / second;
    }
    int multiply(int first, int second){ //method
        return first * second;
    }
    public void process() {
        boolean exit = false;
        Scanner menuScan = new Scanner(System.in);
        while (!exit) {
            System.out.println("What do you want to do? \n Type calc to boot calculator \n Type exit to close program. \n Type hist to previously done calculations");
            System.out.println("Insert choice: ");
            String menuChoice = menuScan.nextLine();
            switch (menuChoice) {
                case "calc" -> calc();
                case "exit" -> exit = true;
                case "hist" -> System.out.println(calculatorHistory.getList()); // not what am I looking for, probably could solve this using 4 lists, and do System.out.Println(calculatorHistory.getFirst,
            }                                                                   // calculatorHistory.getOperator, calculatorHistory.getSecond, calculatorHistory.getResult)
        }
    }
    private void calc() {
        boolean exit = false; //needed for while(!exit)
        Scanner in = new Scanner(System.in); //needed for in.nextLine
        while (!exit) {
            System.out.println("Type the first number: ");
            int firstNumber = Integer.parseInt(in.nextLine());
            System.out.println("Type the operator: ");
            String operation = in.nextLine();
            System.out.println("Type the second number: ");
            int secondNumber = Integer.parseInt(in.nextLine());
            int result = switch (operation) {
                case "+" -> add(firstNumber, secondNumber);
                case "-" -> subtract(firstNumber, secondNumber);
                case "*" -> multiply(firstNumber, secondNumber);
                case "/" -> divide(firstNumber, secondNumber);
                default -> throw new IllegalStateException("Unexpected value");
            };
            calculatorHistory.saveCalculation(firstNumber, secondNumber, result, operation); //calcHist = referencja
            System.out.println("Result is: " + result);
            System.out.println("Next calculations? yes/no: ");
            String decision = in.nextLine();
            switch (decision) {
                case "yes" -> {}
                case "no" -> exit = true; //will break the while statement = will come back to the 1st question

            }
        }
    }
}


