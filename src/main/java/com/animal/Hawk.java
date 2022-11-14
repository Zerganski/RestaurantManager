package com.animal;

public class Hawk extends Animal {
    public Hawk(String animalName, String description, String speciesName, int chromosomes) {
        this.animalName = animalName;
        this.description = description;
        this.speciesName = speciesName;
        this.chromosomes = chromosomes;
    }
    @Override
    public void print() {
        System.out.println("This is Hawk:");
        System.out.println("Name: " + animalName + "\n Description: " + description + "\n Species name: " + speciesName + "\n Haploid chromosome number: " + chromosomes / 2);
    }
}
