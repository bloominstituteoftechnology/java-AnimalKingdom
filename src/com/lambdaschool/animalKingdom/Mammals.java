package com.lambdaschool.animalKingdom;

public class Mammals extends AbstractAnimal
{
    public String name;
    public int yearsDiscovered;
    public  Mammals(String name, int yearsDiscovered)
    {
        this.name = name;
        this.yearsDiscovered = yearsDiscovered;
    }


    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public String getBreath()
    {
        return null;
    }

    @Override
    public String getReproduce()
    {
        return null;
    }

    @Override
    public String getConsumeFood()
    {
        return null;
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
