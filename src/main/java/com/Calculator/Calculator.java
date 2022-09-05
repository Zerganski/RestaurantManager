package com.Calculator;
import java.util.Scanner;
/*
0. Figure out how to input X, input function, input Y, in mentioned order.
a. I can do function first and then read X and Y. (I think i want to figure this out first)

1. Create four classes:
a. add (x + y)
b. subtract (x - y)
c. multiply (x * y)
d. divide (x / y)
 */

/*
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What operation would you like to perform: \n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
        int answer = in.nextInt();
        switch (answer) {
            case 1: {
                Operations.add();
            }
            case 2: {
                Operations.subtract();
            }
            case 3: {
                Operations.subtract();
            }
            case 4: {
                Operations.multiply();
            }
        }

    }
    class Operations {
        static int numberOne;
        static int numberTwo;
        static Scanner in = new Scanner(System.in);

        static void add() {
            System.out.println("First number: ");
            numberOne = in.nextInt();
            System.out.println("Second number: ");
            numberTwo = in.nextInt();
            System.out.println("Sum: " + (numberOne + numberTwo));
        }

        static void subtract() {
            System.out.println("First number: ");
            numberOne = in.nextInt();
            System.out.println("Second number: ");
            numberTwo = in.nextInt();
            System.out.println("Sum: " + (numberOne - numberTwo));
        }

        static void multiply() {
            System.out.println("First number: ");
            numberOne = in.nextInt();
            System.out.println("Second number: ");
            numberTwo = in.nextInt();
            System.out.println("Sum: " + (numberOne * numberTwo));
        }

        static void divide() {
            System.out.println("First number: ");
            numberOne = in.nextInt();
            System.out.println("Second number: ");
            numberTwo = in.nextInt();
            System.out.println("Sum: " + (numberOne / numberTwo));
        }
    }
}
*/
public class Calculator {
    private static int numberTwo;
    private static int numberOne;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in your calculation: ");
        numberOne = in.nextInt();
        String answer = in.nextLine();
        switch (answer) {
            case "+":
                add();
            case "-":
                subtract();
            case "*":
                multiply();
            case "/":
                divide();
        }
    }
    static Scanner in = new Scanner(System.in);
    private static void add() {
        numberTwo = in.nextInt();
        System.out.println("Sum: " + (numberOne + numberTwo));
    }
    static void subtract() {
        numberTwo = in.nextInt();
        System.out.println("Sum: " + (numberOne - numberTwo));
    }

    static void multiply() {
        numberTwo = in.nextInt();
        System.out.println("Sum: " + (numberOne * numberTwo));
    }

    static void divide() {
        numberTwo = in.nextInt();
        System.out.println("Sum: " + (numberOne / numberTwo));
    }
}

