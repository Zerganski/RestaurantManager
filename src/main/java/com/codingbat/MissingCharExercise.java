package com.codingbat;

public class MissingCharExercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.MissingCharExercise();
        System.out.println(exercise.missingChar("kitten", 1));
        System.out.println(exercise.missingChar("kitten", 0));
        System.out.println(exercise.missingChar("kitten", 4));
    }

        public String missingChar(String str, int n) {
            String front = str.substring(0, n);
            String back = str.substring(n+1);
            return front + back;
        }
}
