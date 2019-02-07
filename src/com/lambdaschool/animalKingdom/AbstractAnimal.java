package com.lambdaschool.animalKingdom;

import javax.print.DocFlavor;

public abstract class AbstractAnimal
{
    int uniqueId;
    String name;
    int yearDiscovered;
    int food;

    public AbstractAnimal(String name, int yearDiscovered)
    {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
    public AbstractAnimal()
    {
        uniqueId = 0;
        food = 1;
    }

    public abstract String getName();
    public abstract String getBreath();
    public abstract String getReproduce();
    public abstract String getConsumeFood();

    public void consumeFood()
    {
        System.out.printf("EATS");
    }
}
