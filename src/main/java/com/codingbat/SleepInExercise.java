package com.codingbat;

import org.w3c.dom.ls.LSOutput;

public class SleepInExercise {
    public static void main(String[] args) {
     var exercise = new SleepInExercise();
        System.out.println(exercise.sleepIn(false, false));
        System.out.println(exercise.sleepIn(true, false));
        System.out.println(exercise.sleepIn(false, true));
        System.out.println(exercise.sleepIn(false, false));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        }
        else if (weekday == false && vacation == false)
        {
            return true;
        }
        else
        {
            return true;
        }
    }
}
