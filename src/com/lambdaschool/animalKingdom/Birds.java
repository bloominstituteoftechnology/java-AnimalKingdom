package com.lambdaschool.animalKingdom;

public class Birds extends  AbstractAnimal
{
    String name;
    int yearsDiscovered;

    public Birds(String name, int yearsDiscovered)
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
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lung";
    }

    @Override
    public String reproduce()
    {
        return null;
    }



    @Override
    public String toString()
    {
        return "Birds{" +
                "name='" + name + '\'' +
                ", yearsDiscovered=" + yearsDiscovered +
                '}';
    }
}
