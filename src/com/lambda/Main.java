package com.lambda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<Animal>();

        // Adding Mammals
        myAnimals.add(new Mammal("Panda", 1869));
        myAnimals.add(new Mammal("Zebra", 1778));
        myAnimals.add(new Mammal("Koala", 1816));
        myAnimals.add(new Mammal("Sloth", 1804));
        myAnimals.add(new Mammal("Armadillo", 1758));
        myAnimals.add(new Mammal("Raccoon", 1758));
        myAnimals.add(new Mammal("Bigfoot", 2021));

        // Adding Birds
        myAnimals.add(new Bird("Pigeon", 1837));
        myAnimals.add(new Bird("Peacock", 1821));
        myAnimals.add(new Bird("Toucan", 1758));
        myAnimals.add(new Bird("Parrot", 1824));
        myAnimals.add(new Bird("Swan", 1758));

        // Adding Fish
        myAnimals.add(new Fish("Salmon", 1758));
        myAnimals.add(new Fish("Catfish", 1817));
        myAnimals.add(new Fish("Perch", 1758));
    }
}
