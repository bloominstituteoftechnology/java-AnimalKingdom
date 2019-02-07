package animals;

import java.util.ArrayList;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester) {
        for (AbstractAnimals a : animals) {
            if(tester.test(a)) {
                System.out.println("\n" + a.getName());
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<AbstractAnimals> animalsList = new ArrayList<AbstractAnimals>();
        //Collections

        // Mammals
        animalsList.add(new Mammals("Panda", 1869));
        animalsList.add(new Mammals("Zebra", 1776));
        animalsList.add(new Mammals("Koala", 1816));
        animalsList.add(new Mammals("Sloth", 1804));
        animalsList.add(new Mammals("Armadillo", 1758));
        animalsList.add(new Mammals("Raccoon", 1758));
        animalsList.add(new Mammals("Bigfoot", 2021));

        //Birds
        animalsList.add(new Birds("Pigeon", 1837));
        animalsList.add(new Birds("Peacock", 1821));
        animalsList.add(new Birds("Toucan", 1758));
        animalsList.add(new Birds("Parrot", 1824));
        animalsList.add(new Birds("Swan", 1758));

        // Fish
        animalsList.add(new Fish("Salmon", 1758));
        animalsList.add(new Fish("Catfish", 1817));
        animalsList.add(new Fish("Perch", 1758));

        // Foreach loop is (type var : name of array)
        System.out.println("\n*** Collection ***");
        for(AbstractAnimals a : animalsList) {
            System.out.println(a);
        }

        // Descending order by year named

        // List all the animals alphabetically

        // List all the animals order by how they move

        // List only those animals that breath with lungs
        System.out.printf("\n*** Animals that use lungs ***");
        printAnimals(animalsList, a -> a.breath().equals("lungs"));

        // List only thos animals that breath with lungs and were named in 1758
        System.out.printf("\n*** Animals that use lungs & named in 1758 ***");
        printAnimals(animalsList, a -> ((a.breath().equals("lungs")) && (a.getYear() == 1758)));

        // List only those animals that lay eggs and breath with lungs

        // List alphabetically only those animals that were named in 1758
    }
}
