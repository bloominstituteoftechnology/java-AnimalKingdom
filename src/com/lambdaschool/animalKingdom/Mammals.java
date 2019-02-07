package com.lambdaschool.animalKingdom;

public class Mammals extends AbstractAnimal
{
    String name;
    int yearsDiscovered;
    public Mammals(String name, int yearDiscovered)
    {
       this.name = name;
       this.yearsDiscovered = yearDiscovered;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getYear()
    {
        return yearsDiscovered;
    }

    @Override
    public int getId()
    {
        return uniqueId;
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lung";
    }

    @Override
    public String reproduce()
    {
        return "births";
    }

    @Override
    public String toString()
    {
        return "Mammals{" +
                "name='" + name + '\'' +
                ", yearsDiscovered=" + yearsDiscovered +
                '}';
    }
}
