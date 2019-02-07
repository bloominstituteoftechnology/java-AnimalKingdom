package com.lambdaschool;


//Mammals move - walk, breath - lungs, reproduce - live births
public class Mammal extends AbstractAnimal implements AllAnimals
{
    public Mammal(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    // Overrides -------------------------------------------------------
    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "Mammals have lungs";
    }

    @Override
    public String reproduce()
    {
        return "Mammals have live births";
    }

    @Override
    public String eat()
    {
        return "Yum Yum!";
    }
}
