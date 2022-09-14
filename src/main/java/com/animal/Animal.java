package com.animal;  //klasa = plan domu. obiekt = zbudowanym domem

public class Animal {
        private String animalName; // pojemnik (miejsce w pamieci)
        private String speciesName;
        private String description;
        private int chromosomes;

        public int getChromosomes() { return chromosomes;}
        public void setChromosomes(int chromosomes) { //pierwsza inicjalizacja w projekcie
        this.chromosomes = chromosomes;
    }

        public String getDescription() {
        return description;
    }

        public void setDescription(String description) {
        this.description = description;
    }

        public String getSpeciesName() {
        return speciesName;
    }

        public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

        public String getAnimalName() {
        return animalName;
    }

        public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}
