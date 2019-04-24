package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<AbstractAnimal> myList = new ArrayList<>();
        // Birds--------------------------------------
        myList.add(new Bird("Pigeon", 1837));
        myList.add(new Bird("Peacock", 1821));
        myList.add(new Bird("Toucan", 1758));
        myList.add(new Bird("Parrot", 1824));
        myList.add(new Bird("Swan", 1758));

        // Mammals-------------------------------------
        myList.add(new Mammal("Panda", 1869));
        myList.add(new Mammal("Zebra", 1778));
        myList.add(new Mammal("Koala", 1816));
        myList.add(new Mammal("Sloth", 1804));
        myList.add(new Mammal("Armadillo", 1758));
        myList.add(new Mammal("Raccoon", 1758));
        myList.add(new Mammal("BigFoot", 2021));

        for (AbstractAnimal animal : myList)
        {
            System.out.println("ID: " + animal.getId() + " - NAME: " + animal.getName() + " - YEAR EST: " + animal.getYearNamed());
        }

        System.out.println("*** THIS IS A TEST ***");
    }
}
