package com.lambdaschool.animalKingdom;

public class Fish extends AbstractAnimal
{
    String name;
    int yearsDiscovered;

    public Fish(String name, int yearsDiscovered)
    {
        this.name = name;
        this.yearsDiscovered = yearsDiscovered;
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
        return "swim";
    }

    @Override
    public String breath()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "name='" + name + '\'' +
                ", yearsDiscovered=" + yearsDiscovered +
                ", uniqueId=" + uniqueId +
                ", food='" + food + '\'' +
                '}';
    }
}
