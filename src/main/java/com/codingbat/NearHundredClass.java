package com.codingbat;

public class NearHundredClass {
    public static void main(String[] args) {
        var exercise = new com.codingbat.NearHundredClass();
        System.out.println(exercise.nearHundred(93));
        System.out.println(exercise.nearHundred(90));
        System.out.println(exercise.nearHundred(89));
    }
    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10))
                {
            return true;
        }
        else
        {
            return false;
        }
    }
}
