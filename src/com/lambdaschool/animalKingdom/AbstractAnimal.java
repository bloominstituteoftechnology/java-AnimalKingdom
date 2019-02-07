package com.lambdaschool.animalKingdom;

import javax.print.DocFlavor;

public abstract class AbstractAnimal implements Animal
{
    // static so it stays the same for all
    static int maxId = 0;
    int uniqueId;
    String food = "EATING FOOOD";

    public AbstractAnimal()
    {
       this.uniqueId = maxId++;
    }


    public abstract String getName();
    public abstract int getYear();
    public abstract int getId();
    public String food()
    {
        return food;
    }
}
