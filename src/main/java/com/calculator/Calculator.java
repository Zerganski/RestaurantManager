package com.calculator;
import java.util.Scanner;
/*
0. Figure out how to input X, input function, input Y, in mentioned order.
a. I can do function first and then read X and Y. (I think i want to figure this out first)

1. Create four classes:
a. add (x + y)
b. subtract (x - y)
c. multiply (x * y)
d. divide (x / y)



public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What operation would you like to perform: \n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication");
        int answer = in.nextInt();
        switch (answer) {
            case 1: {
                Operations.add();
                return;
            }
            case 2: {
                Operations.subtract();
                return;
            }
            case 3: {
                Operations.divide();
                return;
            }
            case 4: {
                Operations.multiply();
                return;
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
                numberTwo = in.nextInt();
                add();
            case "-":
                numberTwo = in.nextInt();
                subtract();
            case "*":
                numberTwo = in.nextInt();
                multiply();
            case "/":
                numberTwo = in.nextInt();
                divide();
        }
    }
    private static void add() {
        System.out.println("Sum: " + (numberOne + numberTwo));
    }
    static void subtract() {
        System.out.println("Sum: " + (numberOne - numberTwo));
    }

    static void multiply() {
        System.out.println("Sum: " + (numberOne * numberTwo));
    }

    static void divide() {
        System.out.println("Sum: " + (numberOne / numberTwo));
    }
}
*/
/*
class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
} */

public class Calculator {
    static int numberTwo;
    static int numberOne;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to do: calc or exit ");
        String answer = in.nextLine();
        switch (answer) {
            case "calc": {
                Calculations();
            }
            case "exit": {
                System.exit(0);
            }
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

    static void Calculations() {
        char answer = 0;
        do {
            System.out.println("Type in your calculation: ");
            numberOne = in.nextInt();
            answer = in.next().charAt(0);
            switch (answer) {
                case '+':
                    add();
                    break;
                case '-':
                    subtract();
                    break;
                case '*':
                    multiply();
                    break;
                case '/':
                    divide();
                    break;
            }
        } while (answer != '1');
    }
}
