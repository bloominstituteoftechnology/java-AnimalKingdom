package com.vucao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        String[] names = {"Panda", "Zebra", "Koala", "Sloth", "Armadillo", "Raccoon", "Bigfoot", "Pigeon", "Peacock", "Toucan", "Parrot", "Swan", "Salmon", "Catfish", "Perch"};
        String[] types = {"mammals", "mammals", "mammals", "mammals", "mammals", "mammals", "mammals", "birds", "birds", "birds", "birds", "birds", "fish", "fish", "fish"};
        int[] years = {1869,1778,1816,1804,1758,1758,2021,1837,1821,1758,1824,1758,1758,1817,1758};

        ArrayList<AbstractAnimal> animalArrayList = new ArrayList<AbstractAnimal>();

        for (int i=0; i < names.length; i++)
        {
            if (types[i].equals("mammals"))
            {
                animalArrayList.add(new Mammals(names[i], years[i]));
            } else if (types[i].equals("birds"))
            {
                animalArrayList.add(new Birds(names[i], years[i]));
            } else
            {
                animalArrayList.add(new Fish(names[i], years[i]));
            }
        }

        for (AbstractAnimal a: animalArrayList)
        {
            System.out.println(a.getId() + " " + a.getName() + " " + a.getYear() + " " + a.move() + " " + a.breath() + " " + a.reproduce());
        }

        System.out.println("*** All the animals in descending order by year named ***");
        animalArrayList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animalArrayList.forEach(a -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println("\n");

        System.out.println("*** All the animals alphabetically ***");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalArrayList.forEach(a -> System.out.println(a.getName()));
        System.out.println("\n");

        System.out.println("*** All the animals ordered by how they move ***");
        animalArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalArrayList.forEach(a -> System.out.println(a.getName() + " " + a.move()));
        System.out.println("\n");

        System.out.println("*** All animals that breath with lungs ***");
        ArrayList<AbstractAnimal> filteredAnimals = new ArrayList<>(animalArrayList);
        filteredAnimals.removeIf(a -> !a.breath().equals("lungs"));
        filteredAnimals.forEach(a -> System.out.println(a.getName() + " breaths with " + a.breath()));
        System.out.println("\n");

        System.out.println("*** All animals that breath with lungs and were named in 1758 ***");
        ArrayList<AbstractAnimal> filteredAnimals2 = new ArrayList<>(animalArrayList);
        filteredAnimals2.removeIf(a -> !(a.breath().equals("lungs") && a.getYear()==1758));
        filteredAnimals2.forEach(a -> System.out.println(a.getName() + " breaths with " + a.breath() + " and was named in " + a.getYear()));
        System.out.println("\n");

        System.out.println("*** All animals that lay eggs and breath with lungs ***");
        ArrayList<AbstractAnimal> filteredAnimals3 = new ArrayList<>(animalArrayList);
        filteredAnimals3.removeIf(a -> !(a.breath().equals("lungs") && a.reproduce().equals("eggs")));
        filteredAnimals3.forEach(a -> System.out.println(a.getName() + " breaths with " + a.breath() + " lays " + a.reproduce()));
        System.out.println("\n");

        System.out.println("*** All animals that were named in 1758 order by name ***");
        ArrayList<AbstractAnimal> filteredAnimals4 = new ArrayList<>(animalArrayList);
        filteredAnimals4.removeIf(a -> a.getYear()!=1758);
        filteredAnimals4.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredAnimals4.forEach(a -> System.out.println(a.getName() + " was named in " + a.getYear()));
        System.out.println("\n");
    }
}
