package com.lambdaschool;

public abstract class AbstractAnimal
{
    static int maxId = 0;

    int id;

    // Declaring/initializing variables
    String name;
    int yearNamed;

    // constructor
    public AbstractAnimal(String name, int yearNamed)
    {
        this.name = name;
        this.yearNamed = yearNamed;
        id = maxId++; // increment new animal id's
    }

}
