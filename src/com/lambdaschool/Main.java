package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Animal> myAnimals = new ArrayList<>();

        System.out.println("*** Adding Mammals ***");
        myAnimals.add(new Mammal("Panda", 1869));
        myAnimals.add(new Mammal("Zebra", 1778));
        myAnimals.add(new Mammal("Koala", 1816));
        myAnimals.add(new Mammal("Sloth", 1804));
        myAnimals.add(new Mammal("Armadillo", 1758));
        myAnimals.add(new Mammal("Raccoon", 1758));
        myAnimals.add(new Mammal("Bigfoot", 2021));

        System.out.println("\n*** Adding Fish ***");
        myAnimals.add(new Bird("Pigeon", 1837));
        myAnimals.add(new Bird("Peacock", 1821));
        myAnimals.add(new Bird("Toucan", 1758));
        myAnimals.add(new Bird("Parrot", 1824));
        myAnimals.add(new Bird("Swan", 1758));

        System.out.println("\n*** Adding Fish ***");
        myAnimals.add(new Fish("Salmon", 1758));
        myAnimals.add(new Fish("Catfish", 1817));
        myAnimals.add(new Fish("Perch", 1758));

        System.out.println("\n*** List all the animals in descending order by year named ***");
        myAnimals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        myAnimals.forEach(animal -> System.out.println("Animal: " + animal.getName() + " Year Discovered: " + animal.getYearDiscovered()));

        System.out.println("\n*** List animals alphabetically ***");
        myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myAnimals.forEach(animal -> System.out.println(animal.getName()));

        System.out.println("\n*** List animals by how they move ***");
        myAnimals.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.move()));
    }
}
