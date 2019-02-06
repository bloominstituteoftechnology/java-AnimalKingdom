package com.vucao;

public abstract class AbstractAnimal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void eat()
    {
        System.out.println(name + " ate food.");
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
}
