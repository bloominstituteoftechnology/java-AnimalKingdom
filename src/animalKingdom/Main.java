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

    // Fish

    System.out.println("\n*** List all the animals in descending order by year named ***");
    System.out.println();
    // Create ArrayList
    List<Animal> mammalsList = new ArrayList<>();
    mammalsList.add(panda);
    mammalsList.add(zebra);
    mammalsList.add(koala);
    mammalsList.add(sloth);
    mammalsList.add(armadillo);
    mammalsList.add(raccoon);
    mammalsList.add(bigfoot);


    System.out.println("\n*** List all the animals in descending order by year named ***");
    System.out.println();
    // sort() the list in descending order using Lambda exprestions
    // print the decended sorted list
    mammalsList.sort((o1, o2) -> Integer.compare(o2.getYear(), o1.getYear()));
    System.out.println(mammalsList);

    System.out.println();

    System.out.println("\n*** List all the animals alphabetically ***");
    System.out.println();
    mammalsList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    System.out.println(mammalsList);

    }

    public static void main(String[] args) {
        initialData();
    }
}