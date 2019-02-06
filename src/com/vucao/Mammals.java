package com.vucao;

public class Mammals extends AbstractAnimal
{
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "walks";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return (this.getName() + " is a mammal, and was named in " + this.getYear());
    }
}
