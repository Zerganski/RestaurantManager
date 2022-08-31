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
public class AnimalSpecies {
    String animalNameBird = "hawk";
    String speciesNameBird = "bird";
    int chromosomeNumberBird = 80;
    String descriptionBird = "Hawks are strong, powerful birds. Their feet are equipped with sharp, curved talons for capturing prey, and their strong beaks are hooked for biting and tearing flesh.";

    String animalNameBear = "bear";
    String speciesNameBear = "mammal";
    int chromosomeNumberBear = 74;
    String descriptionBear = "Big mammal with thick fur that hibernate in winter.";

    String animalNameLobster = "lobster";
    String speciesNameLobster = "arthropod";
    int chromosomeNumberLobster = 136;
    String descriptionLobster = "Lobsters have compound eyes on movable stalks, two pairs of long antennae, and several pairs of swimming legs (swimmerets) on the elongated abdomen.";

    public static void main(String[] args) {
        AnimalSpecies TestSpecies = new AnimalSpecies();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which animal specie would you like to get information of?: \n 1. Hawk \n 2. Bear \n 3. Lobster \n Your input: ");
        String choice = scanner.next();
        if(choice.equals("1")) {
            System.out.print("Animal name is: " + TestSpecies.animalNameBird + "\n");
            System.out.print("Animal specie is: " + TestSpecies.speciesNameBird + "\n");
            System.out.print("Animal haploid chromosome number is: " + TestSpecies.chromosomeNumberBird/2 + "\n");
            System.out.print("Animal description is: " + TestSpecies.descriptionBird + "\n");
        }
        else if(choice.equals("2"))
        {
            System.out.print("Animal name is: " + TestSpecies.animalNameBear + "\n");
            System.out.print("Animal specie is: " + TestSpecies.speciesNameBear + "\n");
            System.out.print("Animal haploid chromosome number is: " + TestSpecies.chromosomeNumberBear/2 + "\n");
            System.out.print("Animal description is: " + TestSpecies.descriptionBear + "\n");
        }
        else if(choice.equals("3"))
        {
            System.out.print("Animal name is: " + TestSpecies.animalNameLobster + "\n");
            System.out.print("Animal specie is: " + TestSpecies.speciesNameLobster + "\n");
            System.out.print("Animal haploid chromosome number is: " + TestSpecies.chromosomeNumberLobster/2 + "\n");
            System.out.print("Animal description is: " + TestSpecies.descriptionLobster + "\n");
        }
    }
}
