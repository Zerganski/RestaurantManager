package com.codingbat;

public class SumDoubleExercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.SumDoubleExercise();
        System.out.println(exercise.sumDouble(1, 2));
        System.out.println(exercise.sumDouble(3, 2));
        System.out.println(exercise.sumDouble(2, 2));
        System.out.println(exercise.sumDouble(4, 4));
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a==b)
        {
            return a * 2;
        }
        return sum;
    }
}
