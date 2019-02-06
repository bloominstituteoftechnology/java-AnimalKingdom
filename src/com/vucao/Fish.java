package com.vucao;

public class Fish extends AbstractAnimal
{
    public Fish(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "swims";
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
        return (this.getName() + " is a fish, and was named in " + this.getYear());
    }
}
