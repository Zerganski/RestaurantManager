package com.codingbat;

public class PosNegExercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.PosNegExercise();
        System.out.println(exercise.posNeg(1, -1, false));
        System.out.println(exercise.posNeg(-1, 1, false));
        System.out.println(exercise.posNeg(-4, -5, true));
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative)
        {
            return (a < 0 && b < 0);
        }
        else
        {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}