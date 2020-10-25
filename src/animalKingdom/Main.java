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


    // Create ArrayList, and Lambda exprestion
    // print out lambda exprestion
    List<Animal> mammalsList = new ArrayList<>();
    mammalsList.add(panda);
    mammalsList.add(zebra);
    mammalsList.add(koala);
    mammalsList.add(sloth);
    mammalsList.add(armadillo);
    mammalsList.add(raccoon);
    mammalsList.add(bigfoot);

    System.out.println(mammalsList);

    }

    public static void main(String[] args) {
        initialData();
    }
}