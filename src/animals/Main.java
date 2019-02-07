package animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<AbstractAnimals> animalsList = new ArrayList<AbstractAnimals>();
        animalsList.add(new Mammals("Panda", 1869));
        animalsList.add(new Mammals("Zebra", 1776));
        animalsList.add(new Mammals("Koala", 1816));
        animalsList.add(new Mammals("Sloth", 1804));
        animalsList.add(new Mammals("Armadillo", 1758));
        animalsList.add(new Mammals("Raccoon", 1758));
        animalsList.add(new Mammals("Bigfoot", 2021));

        for(AbstractAnimals a : animalsList) {
            System.out.println(a);
        }
    }
}
