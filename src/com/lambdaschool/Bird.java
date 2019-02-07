package com.lambdaschool;


// Birds move - fly, breath - lungs, reproduce - eggs
public class Bird extends AbstractAnimal implements AllAnimals
{
    public Bird(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    // Overrides------------------------------------
    @Override
    public String move()
    {
        return null;
    }

    @Override
    public String breathe()
    {
        return "Birds have lungs"
    }

    @Override
    public String reproduce()
    {
        return "Birds lay eggs"
    }

    @Override
    public String eat()
    {
        return null;
    }
}
