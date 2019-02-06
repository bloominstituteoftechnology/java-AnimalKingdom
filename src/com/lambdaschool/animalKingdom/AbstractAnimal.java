package com.lambdaschool.animalKingdom;

import javax.print.DocFlavor;

public abstract class AbstractAnimal
{
    private int uniqueId = 0;
    String name;
    int yearDiscovered;

    public AbstractAnimal( String name, int yearDiscovered)
    {
        uniqueId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public void move()
    {
        System.out.println("moving");
    }
    public void breath()
    {
        System.out.println("breathing");
    }

    public void reproduce()
    {
        System.out.println("reproducing");
    }



    public void consumeFood()
    {
        System.out.println("Consuming food");
    }

}
