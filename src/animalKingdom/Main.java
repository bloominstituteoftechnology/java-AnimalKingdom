package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    private static void initialData() {
        System.out.println("Initializing App");

    // Mammals
    Mammals panda = new Mammals("Panda", 1869);
    Mammals zebra = new Mammals("Zebra", 1778);
    Mammals koala = new Mammals("Koala", 1816);
    Mammals sloth = new Mammals("Sloth", 1804);
    Mammals armadillo = new Mammals("Armadillo", 1758);
    Mammals raccoon = new Mammals("Raccoon", 1758);
    Mammals bigfoot = new Mammals("Bigfoot", 2021);

    // Birds
    Birds pigeon = new Birds("Pigeon", 1837);
    Birds peacock = new Birds("Peacock", 1821);
    Birds toucan = new Birds("Toucan", 1758);
    Birds parrot = new Birds("Parrot", 1824);
    Birds swan = new Birds("Swan", 1758);

    // Fish
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch =  new Fish("Perch", 1758);

    // List the animals on how they move. Only need three based on the three animal types
    // First pass solution:
    // Mammals move
    panda.setMove("Walk");
    zebra.setMove("Walk");
    koala.setMove("Walk");
    sloth.setMove("Walk");
    armadillo.setMove("Walk");
    raccoon.setMove("Walk");
    bigfoot.setMove("Walk");

    // Birds move
    pigeon.setMove("Fly");
    peacock.setMove("Fly");
    toucan.setMove("Fly");
    parrot.setMove("Fly");
    swan.setMove("Fly");

    // Fish move
    salmon.setMove("Swim");
    catfish.setMove("Swim");
    perch.setMove("Swim");


    // Create ArrayList
    List<Animal> animals = new ArrayList<>();
    // Mammals
    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    // Bird
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    // Fish
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);

    System.out.println("\n*** List all the animals in descending order by year named ***");
    System.out.println();
    // sort() the list in descending order using Lambda exprestions
    // print the decended sorted list
    animals.sort((o1, o2) -> Integer.compare(o2.getYear(), o1.getYear()));
    System.out.println(animals);

    System.out.println();

    System.out.println("\n*** List all the animals alphabetically ***");
    System.out.println();
    animals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    System.out.println(animals);

    System.out.println();
    System.out.println("\n*** List all the animals order by how they move ***");
    System.out.println();
    animals.sort((m1, m2) -> m1.getMove().compareToIgnoreCase(m2.getMove()));
    System.out.println(animals);

    }

    public static void main(String[] args) {
        initialData();
    }
}