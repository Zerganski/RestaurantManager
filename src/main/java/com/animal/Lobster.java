package com.animal;

public class Lobster extends Animal {
    public Lobster(String animalName, String description, String speciesName, int chromosomes) {
        this.animalName = animalName;
        this.description = description;
        this.speciesName = speciesName;
        this.chromosomes = chromosomes;
    }
    @Override
    public void print() {
        System.out.println("This is Lobster:");
        System.out.println("Name: " + animalName + "\n Description: " + description + "\n Species name: " + speciesName + "\n Haploid chromosome number: " + chromosomes / 2);
    }
}
