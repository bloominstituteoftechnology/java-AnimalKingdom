package com.vucao;

import java.util.ArrayList;

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


    }
}
