package com.animalkingdom.demo;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static List<Animal> displayAnimal(List<Animal> animalList, CheckAnimal tester)
    {
        List <Animal> myAnimalList = new ArrayList<>();
        for(Animal animal : animalList)
        {
            if(tester.test(animal))
            {
                System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breathe() + " " + animal.getYear());
            }
        }

        return null;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to th Animal Kingdom");

        // Adding animals to a list
        List<Animal> animalArrayList = new ArrayList<>();

        // Adding mammals
        animalArrayList.add(new Mammals("Panda", 1869));
        animalArrayList.add(new Mammals("Zebra", 1778));
        animalArrayList.add(new Mammals("Koala", 1816));
        animalArrayList.add(new Mammals("Sloth", 1804));
        animalArrayList.add(new Mammals("Armadillo", 1758));
        animalArrayList.add(new Mammals("Raccoon", 1758));
        animalArrayList.add(new Mammals("Bigfoot", 2021));

        //Adding birds
        animalArrayList.add(new Birds("Pigeon", 1837));
        animalArrayList.add(new Birds("Peacock", 1821));
        animalArrayList.add(new Birds("Toucan", 1758));
        animalArrayList.add(new Birds("Parrot", 1824));
        animalArrayList.add(new Birds("Swan", 1758));

        //Adding fish
        animalArrayList.add(new Fish("Salmon", 1758));
        animalArrayList.add(new Fish("Catfish", 1817));
        animalArrayList.add(new Fish("Perch", 1758));

        //Lambda Expressions

        System.out.println("Animals in descending order by year");
        animalArrayList.sort((a1,a2) -> a2.getYear() - a1.getYear());
        System.out.println(animalArrayList.toString());

        System.out.println();

        System.out.println("Animals listed by movement");
        System.out.println();
        animalArrayList.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalArrayList);

        System.out.println();

        System.out.println("Animals who only breathe with lungs");
        System.out.println();
        displayAnimal(animalArrayList, a -> (a.breathe().equalsIgnoreCase("lungs")));

        System.out.println();

        System.out.println("Animals who only breathe with lungs that were named in 1758");
        displayAnimal(animalArrayList, a -> (a.getYear()) == 1758 && a.breathe().equalsIgnoreCase("lungs"));

        System.out.println();

        System.out.println("Animals that only breathe with lungs and lay eggs");
        displayAnimal(animalArrayList, a -> (a.reproduce()).equalsIgnoreCase("eggs") && a.breathe().equalsIgnoreCase("lungs"));

        System.out.println();
        System.out.println("Animals by alphabetical order who were named in 1758");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        displayAnimal(animalArrayList, a -> (a.getYear() == 1758));

        System.out.println();
        System.out.println("Animals by alphabetical order");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalArrayList.toString());

    }
}
