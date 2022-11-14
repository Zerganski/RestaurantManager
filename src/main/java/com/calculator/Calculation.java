package com.calculator;

public class Calculation {
    private int firstNumber;
    private int secondNumber;
    private int result;
    private String operation;

    public Calculation(int firstNumber, int secondNumber, int result, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
        this.operation = operation;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", result=" + result +
                ", operation='" + operation + '\'' +
                '}';
    }
}
