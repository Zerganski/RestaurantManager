package com.testing;

public class ExerciseProcessor {

    public static void main(String[] args) {
        ExerciseServiceImpl service = new ExerciseServiceImpl();
        service.printCat(); //meow
        printThing(service); //meow woof
        service.printDog(); //woof

    }
    static void printThing(ExerciseServiceImpl thing){
        thing.printCat();
        thing.printDog();
    }
}
