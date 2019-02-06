package com.vucao;

public class Birds extends AbstractAnimal
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "flies";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return (this.getName() + " is a bird, and was named in " + this.getYear());
    }
}
