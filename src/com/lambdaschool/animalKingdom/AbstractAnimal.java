package com.lambdaschool.animalKingdom;

import javax.print.DocFlavor;

public abstract class AbstractAnimal
{
    int uniqueId;
    String name;
    int yearDiscovered;

    public AbstractAnimal( String name, int yearDiscovered)
    {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
    public AbstractAnimal()
    {
        uniqueId = 0;
    }


}
