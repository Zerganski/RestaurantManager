package com.codingbat;

public class ParrotTroubleExercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.ParrotTroubleExercise();
        System.out.println(exercise.parrotTrouble(true, 6));
        System.out.println(exercise.parrotTrouble(true, 7));
        System.out.println(exercise.parrotTrouble(false, 6));
        System.out.println(exercise.parrotTrouble(true, 21));
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour<7 || hour>20) && talking == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
