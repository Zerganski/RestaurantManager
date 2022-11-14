package com.codingbat;

public class Makes10Exercise {
    public static void main(String[] args) {
        var exercise = new Makes10Exercise();
        System.out.println(exercise.makes10(9, 10));
        System.out.println(exercise.makes10(9, 9));
        System.out.println(exercise.makes10(1, 9));
    }
    public boolean makes10(int a, int b) {
        if (a + b == 10 || a == 10 || b == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}