package com.codingbat;

public class Diff21Exercise {
    public static void main(String[] args) {
        var exercise = new com.codingbat.Diff21Exercise();
        System.out.println(exercise.diff21(19));
        System.out.println(exercise.diff21(10));
        System.out.println(exercise.diff21(21));
        System.out.println(exercise.diff21(40));
    }
    public int diff21(int n) {
    if (n<=21)
    {
        return 21 - n;
    }
    else
    {
        return (n - 21) * 2;
    }
    }
}


