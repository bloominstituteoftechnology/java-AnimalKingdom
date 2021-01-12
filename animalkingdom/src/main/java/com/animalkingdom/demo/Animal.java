package com.animalkingdom.demo;

abstract class Animal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public Animal(String name, int year)
    {
        id = maxId++;
        this.name = name;
        this.year = year;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public String eat()
    {
        return "Yum";
    }
    public int getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
