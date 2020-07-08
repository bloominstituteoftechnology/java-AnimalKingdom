package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Hello from the AnimalKingdom");
        System.out.println("-----------------------------");
        
        List<Animals> animalArrList = new ArrayList<>();

        // Mammals
        animalArrList.add(new Mammals("Panda", 1869));
        animalArrList.add(new Mammals("Zebra", 1778));
        animalArrList.add(new Mammals("Koala", 1816));
        animalArrList.add(new Mammals("Sloth", 1804));
        animalArrList.add(new Mammals("Armadillo", 1758));
        animalArrList.add(new Mammals("Raccoon", 1758));
        animalArrList.add(new Mammals("Bigfoot", 2021));

        // Birds
        animalArrList.add(new Birds("Pigeon", 1837));
        animalArrList.add(new Birds("Peacock", 1821));
        animalArrList.add(new Birds("Toucan", 1758));
        animalArrList.add(new Birds("Parrot", 1824));
        animalArrList.add(new Birds("Swan", 1758));

        // Fish
        animalArrList.add(new Fish("Salmon", 1758));
        animalArrList.add(new Fish("Catfish", 1817));
        animalArrList.add(new Fish("Perch", 1758));

        System.out.println("*** MVP ***");
        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        animalArrList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        System.out.println(animalArrList.toString());;
    }
}