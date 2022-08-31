package com.animal;

import java.util.Scanner;

/*
1. Create a Class which will contain the following fields information
a. animal name = String
b. speciesName = String
c. Number of chromosomes = int
d. Description = String

2. Create 3 instances of the class for different species and test the methods using System.out.println() in main method.
*/
/*
public class AnimalSpecies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which animal specie would you like to get information of?: \n 1. Hawk \n 2. Bear \n 3. Lobster \n Your input: ");
        int answer = in.nextInt();
        switch (answer) {
            case 1:
            System.out.print("Animal name is: " + Animals.animalNameBird + "\n");
            System.out.print("Animal specie is: " + Animals.speciesNameBird + "\n");
            System.out.print("Animal haploid chromosome number is: " + Animals.chromosomeNumberBird/2 + "\n");
            System.out.print("Animal description is: " + Animals.descriptionBird + "\n");
            break;

           case 2:
            System.out.print("Animal name is: " + Animals.animalNameBear + "\n");
            System.out.print("Animal specie is: " + Animals.speciesNameBear + "\n");
            System.out.print("Animal haploid chromosome number is: " + Animals.chromosomeNumberBear/2 + "\n");
            System.out.print("Animal description is: " + Animals.descriptionBear + "\n");
            break;


            case 3:
            System.out.print("Animal name is: " + Animals.animalNameLobster + "\n");
            System.out.print("Animal specie is: " + Animals.speciesNameLobster + "\n");
            System.out.print("Animal haploid chromosome number is: " + Animals.chromosomeNumberLobster/2 + "\n");
            System.out.print("Animal description is: " + Animals.descriptionLobster + "\n");
            break;
        }
    }
}

class Animals
{
    static String animalNameBird = "hawk";
    static String speciesNameBird = "bird";
    static int chromosomeNumberBird = 80;
    static String descriptionBird = "Hawks are strong, powerful birds. Their feet are equipped with sharp, curved talons for capturing prey, and their strong beaks are hooked for biting and tearing flesh.";

    static String animalNameBear = "bear";
    static String speciesNameBear = "mammal";
    static int chromosomeNumberBear = 74;
    static String descriptionBear = "Big mammal with thick fur that hibernate in winter.";

    static String animalNameLobster = "lobster";
    static String speciesNameLobster = "arthropod";
    static int chromosomeNumberLobster = 136;
    static String descriptionLobster = "Lobsters have compound eyes on movable stalks, two pairs of long antennae, and several pairs of swimming legs (swimmerets) on the elongated abdomen.";
}
*/

    class Animals
    {
    String animalName;
    String speciesName;
    int chromosomeNumber;
    String description;
    }
public class AnimalSpecies {
    public static void main(String[] args) {

        Animals hawk = new Animals();
        Animals bear = new Animals();
        Animals lobster = new Animals();

        hawk.animalName = "hawk";
        hawk.speciesName = "bird";
        hawk.chromosomeNumber = 80;
        hawk.description = "Hawks are strong, powerful birds. Their feet are equipped with sharp, curved talons for capturing prey, and their strong beaks are hooked for biting and tearing flesh.";

        bear.animalName = "bear";
        bear.speciesName = "mammal";
        bear.chromosomeNumber = 74;
        bear.description = "Big mammal with thick fur that hibernate in winter.";

        lobster.animalName = "lobster";
        lobster.speciesName = "arthropod";
        lobster.chromosomeNumber = 136;
        lobster.description = "Lobsters have compound eyes on movable stalks, two pairs of long antennae, and several pairs of swimming legs (swimmerets) on the elongated abdomen.";

        Scanner in = new Scanner(System.in);
        System.out.print("Which animal specie would you like to get information of?: \n 1. Hawk \n 2. Bear \n 3. Lobster \n Your input: ");
        int answer = in.nextInt();

        switch (answer) {
            case 1:
                System.out.print("Animal name is: " + hawk.animalName + "\n");
                System.out.print("Animal specie is: " + hawk.speciesName + "\n");
                System.out.print("Animal haploid chromosome number is: " + hawk.chromosomeNumber / 2 + "\n");
                System.out.print("Animal description is: " + hawk.description + "\n");
                break;

            case 2:
                System.out.print("Animal name is: " + bear.animalName + "\n");
                System.out.print("Animal specie is: " + bear.speciesName + "\n");
                System.out.print("Animal haploid chromosome number is: " + bear.chromosomeNumber / 2 + "\n");
                System.out.print("Animal description is: " + bear.description + "\n");
                break;


            case 3:
                System.out.print("Animal name is: " + lobster.animalName + "\n");
                System.out.print("Animal specie is: " + lobster.speciesName + "\n");
                System.out.print("Animal haploid chromosome number is: " + lobster.chromosomeNumber / 2 + "\n");
                System.out.print("Animal description is: " + lobster.description + "\n");
                break;
        }
    }
}