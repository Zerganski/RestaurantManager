package com.codingbat;

public class MonkeyTroubleExercise {
    public static void main(String[] args) {
        var exercise = new MonkeyTroubleExercise();
        System.out.println(exercise.monkeyTrouble(false, false));
        System.out.println(exercise.monkeyTrouble(true, true));
        System.out.println(exercise.monkeyTrouble(true, false));
        System.out.println(exercise.monkeyTrouble(false, true));
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile ==true || aSmile == false && bSmile == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
