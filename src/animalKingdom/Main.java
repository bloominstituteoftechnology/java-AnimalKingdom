package animalKingdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    private static List<Animal> filteredAnimals(List<Animal> animals, AnimalCompare checker) 
    {
        List<Animal> tempList = new ArrayList<>();
        for (Animal v: animals)
        {
            if (checker.checkAnimal(v))
            {
                tempList.add(v);
            }
        }
        return tempList;
    }

    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<Animal> myAnimalList = new ArrayList<>();
        myAnimalList.add(panda);
        myAnimalList.add(zebra);
        myAnimalList.add(koala);
        myAnimalList.add(sloth);
        myAnimalList.add(armadillo);
        myAnimalList.add(raccoon);
        myAnimalList.add(bigfoot);
        myAnimalList.add(pigeon);
        myAnimalList.add(peacock);
        myAnimalList.add(toucan);
        myAnimalList.add(parrot);
        myAnimalList.add(swan);
        myAnimalList.add(salmon);
        myAnimalList.add(catfish);
        myAnimalList.add(perch);
        // System.out.println(myAnimalList);
        System.out.println("\n **** sorting in descending order by year ****\n");
        myAnimalList.sort((v1, v2) -> Integer.compare(v1.getYear(), v2.getYear()));
        Collections.reverse(myAnimalList);
        myAnimalList.forEach((v) -> System.out.println(v));
        System.out.println("\n **** sorted by name ****\n");
        myAnimalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myAnimalList.forEach((v) -> System.out.println(v));
        System.out.println("\n **** sorted how then animal moves ****\n");
        myAnimalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        myAnimalList.forEach((v) -> System.out.println(v));
        System.out.println("\n **** filtering out Animals that dont have lungs ****\n");
        List<Animal> lungAnimals = filteredAnimals(myAnimalList, (v) -> ((v instanceof Mammal) || (v instanceof Bird)));
        lungAnimals.forEach((v) -> System.out.println(v.filteredString()));
        System.out.println("\n **** filtering out Animals that dont have lungs and aren't born in 1758 ****\n");
        List<Animal> lungAnimalsYear = filteredAnimals(myAnimalList, (v) -> ((v instanceof Mammal) || (v instanceof Bird)) && v.getYear() == 1758);
        lungAnimalsYear.forEach((v) -> System.out.println(v.filteredString()));
        System.out.println("\n *** List only those animals that lay eggs and breath with lungs ***\n");
        List<Animal> lungEggAnimals = filteredAnimals(myAnimalList, (v) -> ((v instanceof Bird)));
        lungEggAnimals.forEach((v) -> System.out.println(v.filteredString()));
        System.out.println("\n *** List alphabetically only those animals that were named in 1758 ***\n");
        List<Animal> AlphabeticallyAnimals = filteredAnimals(myAnimalList, (v) -> (v.getYear() == 1758));
        AlphabeticallyAnimals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        AlphabeticallyAnimals.forEach((v) -> System.out.println(v.filteredString()));
    }
}