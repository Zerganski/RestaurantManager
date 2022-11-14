package com.calculator;
import java.util.ArrayList;
import java.util.List;

public class CalculatorHistory {
    private List<Calculation> calculations = new ArrayList<>();

    public void saveCalculation(int firstNumber, int secondNumber, int result, String operation)
    {
        Calculation calculation = new Calculation(firstNumber, secondNumber, result, operation); //alt p podpowiada
        calculations.add(calculation);
    }
    public String getList(){
        return calculations.toString();
    }
}


