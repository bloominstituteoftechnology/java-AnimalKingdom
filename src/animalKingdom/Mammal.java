package animalKingdom;

public class Mammal extends Animal
{
    private String name;
    private int year;
    private int id;

    public Mammal(int id, String name, int year)
    {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getYear()
    {
        return year;
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live birth";
    }

    @Override
    public String toString()
    {
        return "Animals{id=" + id + " name=" + name + " yearNamed=" + year + "}\n";

    }
}