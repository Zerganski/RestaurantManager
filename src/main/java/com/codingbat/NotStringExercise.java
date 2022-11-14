package com.codingbat;

public class NotStringExercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.NotStringExercise();
        System.out.println(exercise.notString("candy"));
        System.out.println(exercise.notString("x"));
        System.out.println(exercise.notString("not bad"));
    }
    public String notString(String str) {
        if(str.startsWith("not"))
        {
            return str;
        }
        else
        {
            return "not " + str;
        }
    }
}