package animalkingdom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> myAnimals = new ArrayList<AbstractAnimal>();

        // Adding Mammals
        myAnimals.add(new Mammals("Panda", 1869));
        myAnimals.add(new Mammals("Zebra", 1778));
        myAnimals.add(new Mammals("Koala", 1816));
        myAnimals.add(new Mammals("Sloth", 1804));
        myAnimals.add(new Mammals("Armadillo", 1758));
        myAnimals.add(new Mammals("Raccoon", 1758));
        myAnimals.add(new Mammals("Bigfoot", 2021));

        // Adding Birds
        myAnimals.add(new Birds("Pigeon", 1837));
        myAnimals.add(new Birds("Peacock", 1821));
        myAnimals.add(new Birds("Toucan", 1758));
        myAnimals.add(new Birds("Parrot", 1824));
        myAnimals.add(new Birds("Swan", 1758));

        // Adding Fish
        myAnimals.add(new Fish("Salmon", 1758));
        myAnimals.add(new Fish("Catfish", 1817));
        myAnimals.add(new Fish("Perch", 1758));
    }
}