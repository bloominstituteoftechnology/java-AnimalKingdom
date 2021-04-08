package com.lambdaschool.animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class AnimalkingdomApplication {

    private static List<AbstractAnimals> filterAnimal(List<AbstractAnimals> animals,
                                                      ListFilter target ) {
        List <AbstractAnimals> tempList = new ArrayList<>();

        for (AbstractAnimals v : animals ) {
            if (target.animalVariable(v)) {
                tempList.add(v);
            }
        }
        return tempList;

    }

    public static void main(String[] args) {
        Mammals panda = new Mammals("Panda", 1869);
        System.out
                .println("Animal " + "Id: " + panda.getAnimalId() + " Name: " + panda.getAnimalName() + " Year: " + panda.getYearDiscovered());

        Mammals zebra = new Mammals("Zebra", 1778);
        System.out
                .println("Animal " + "Id: " + zebra.getAnimalId() + " Name: " + zebra.getAnimalName() + " Year: " + zebra.getYearDiscovered());

        Mammals koala = new Mammals("Koala", 1816);
        System.out
                .println("Animal " + "Id: " + koala.getAnimalId() + " Name: " + koala.getAnimalName() + " Year: " + koala.getYearDiscovered());

        Mammals sloth = new Mammals("Sloth", 1804);
        System.out
                .println("Animal " + "Id: " + sloth.getAnimalId() + " Name: " + sloth.getAnimalName() + " Year: " + sloth.getYearDiscovered());

        Mammals armadillo = new Mammals("Armadillo", 1758);
        System.out.println("Animal " + "Id: " + armadillo.getAnimalId() + " Name: " + armadillo.getAnimalName() + " Year: "
                + armadillo.getYearDiscovered());

        Mammals racoon = new Mammals("Racoon", 1758);
        System.out.println(
                "Animal " + "Id: " + racoon.getAnimalId() + " Name: " + racoon.getAnimalName() + " Year: " + racoon.getYearDiscovered());

        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        System.out.println(
                "Animal " + "Id: " + bigfoot.getAnimalId() + " Name: " + bigfoot.getAnimalName() + " Year: " + bigfoot.getYearDiscovered());

        // Birds
        System.out.println();
        Birds pigeon = new Birds("Pigeon", 1838);
        System.out.println(
                "Animal " + "Id: " + pigeon.getAnimalId() + " Name: " + pigeon.getAnimalName() + " Year: " + pigeon.getYearDiscovered());

        Birds peacock = new Birds("Peacock", 1821);
        System.out.println(
                "Animal " + "Id: " + peacock.getAnimalId() + " Name: " + peacock.getAnimalName() + " Year: " + peacock.getYearDiscovered());

        Birds toucan = new Birds("Toucan", 1758);
        System.out.println(
                "Animal " + "Id: " + toucan.getAnimalId() + " Name: " + toucan.getAnimalName() + " Year: " + toucan.getYearDiscovered());

        Birds parrot = new Birds("Parrot", 1824);
        System.out.println(
                "Animal " + "Id: " + parrot.getAnimalId() + " Name: " + parrot.getAnimalName() + " Year: " + parrot.getYearDiscovered());

        Birds swan = new Birds("Swan", 1758);
        System.out.println("Animal " + "Id: " + swan.getAnimalId() + " Name: " + swan.getAnimalName() + " Year: " + swan.getYearDiscovered());

        // Fish
        System.out.println();
        Fish salmon = new Fish("Salmon", 1758);
        System.out.println(
                "Animal " + "Id: " + salmon.getAnimalId() + " Name: " + salmon.getAnimalName() + " Year: " + salmon.getYearDiscovered());

        Fish catfish = new Fish("Catfish", 1817);
        System.out.println(
                "Animal " + "Id: " + catfish.getAnimalId() + " Name: " + catfish.getAnimalName() + " Year: " + catfish.getYearDiscovered());

        Fish perch = new Fish("Perch", 1758);
        System.out
                .println("Animal " + "Id: " + perch.getAnimalId() + " Name: " + perch.getAnimalName() + " Year: " + perch.getYearDiscovered());

        List<AbstractAnimals> animalsList = new ArrayList<>();

        animalsList.add(panda);
        animalsList.add(zebra);
        animalsList.add(koala);
        animalsList.add(sloth);
        animalsList.add(armadillo);
        animalsList.add(racoon);
        animalsList.add(bigfoot);
        animalsList.add(pigeon);
        animalsList.add(peacock);
        animalsList.add(toucan);
        animalsList.add(parrot);
        animalsList.add(swan);
        animalsList.add(salmon);
        animalsList.add(catfish);
        animalsList.add(perch);

        // Checking to make sure List works
        System.out.println("\n\n***Animals List***");
        System.out.println();
        System.out.println("Animals: " + animalsList);

        // Descending Order List
        System.out.println("\n\n***Descending Order by Year***");
        animalsList.sort((a1, a2) -> a2.getYearDiscovered() - (a1.getYearDiscovered()));
        System.out.println();
        System.out.println("Animals: " + animalsList);

        // Alphabetical Order
        System.out.println("\n\n***Alphabetical Order***");
        animalsList.sort((a1, a2) -> a1.getAnimalName().compareToIgnoreCase(a2.getAnimalName()));
        System.out.println("Animals: " + animalsList);

        // Order of Movement
        System.out.println("\n\n***Movement Order***");
        animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("Animals: " + animalsList);

        // Animals with Lungs
        System.out.println("\n\n***Animals With Lungs***");
        List<AbstractAnimals> filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs");
        filteredList.forEach((v) -> System.out.println(v));

        // Animals with Lungs and 1758
        System.out.println("\n\n***Animals With Lungs Discovered in 1758***");
        filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs" && v.getYearDiscovered() == 1758);
        filteredList.forEach((v) -> System.out.println(v));

        // Animals with lungs and eggs
        System.out.println("\n\n***Animals With Lungs and Eggs***");
        filteredList = filterAnimal(animalsList, v -> v.breath() == "Lungs" && v.reproduce() == "Eggs");
        filteredList.forEach((v) -> System.out.println(v));

        // Animals Alphabetically on 1758
        System.out.println("\n\n***Animals Named in 1758 Alphabetically***");
        filteredList = filterAnimal(animalsList, v -> v.getYearDiscovered() == 1758);
        filteredList.sort((a1, a2) -> a1.getAnimalName().compareToIgnoreCase(a2.getAnimalName()));
        filteredList.forEach((v) -> System.out.println(v));

        // Stretch Mammals Alphabatically
        System.out.println("\n\n***Mammals Alphabetically***");
        filteredList = filterAnimal(animalsList, v -> v.classification() == "Mammals");
        filteredList.sort((a1, a2) -> a1.getAnimalName().compareToIgnoreCase(a2.getAnimalName()));
        filteredList.forEach((v) -> System.out.println(v));
    }



}
