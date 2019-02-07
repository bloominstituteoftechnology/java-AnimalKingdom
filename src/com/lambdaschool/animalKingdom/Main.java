package com.lambdaschool.animalKingdom;

import java.util.ArrayList;

public class Main {
    // this method will be the same for all, and won't return anything
    public  static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal a : animals)
        {
            if(tester.test(a))
            {
                System.out.println(a);
            }
        }
    }


    public static void main(String[] args) {
        // write your code here
        ArrayList<AbstractAnimal> AnimalList = new ArrayList<AbstractAnimal>();


        AnimalList.add(new Mammals("Panda", 1869));
        AnimalList.add(new Mammals("Zebra", 1778));
        AnimalList.add(new Mammals("Koala", 1816));
        AnimalList.add(new Mammals("Sloth", 1806));
        AnimalList.add(new Mammals("Armadillo", 1758));
        AnimalList.add(new Mammals("Raccoon", 1758));
        AnimalList.add(new Mammals("BigFoot", 2021));

        AnimalList.add(new Birds("Pigeon", 1837));
        AnimalList.add(new Birds("Peacock", 1821));
        AnimalList.add(new Birds("Toucan", 1758));
        AnimalList.add(new Birds("Parrot", 1824));
        AnimalList.add(new Birds("Swan", 1758));

        AnimalList.add(new Fish("Salmon", 1758));
        AnimalList.add(new Fish("Catfish", 1817));
        AnimalList.add(new Fish("Perch", 1758));

        AnimalList.sort((o1,o2) -> o1.getYear() - o2.getYear());
        System.out.println("ANIMALS LISTED BY YEARS DISCOVERED: " + AnimalList.toString());


        System.out.println("ANIMALS ALPHABETICAL ORDER:\n");
        AnimalList.sort((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        System.out.println(AnimalList);
        System.out.println("LUNGS ONLY");
        printAnimals(AnimalList, a -> a.breath() == "lung");
    }
}
