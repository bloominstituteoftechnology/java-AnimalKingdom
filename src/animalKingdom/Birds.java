package animalKingdom;

public class Birds extends Animal
{
    private String name;
    private int year;
    private int id;

    public Birds(int id, String name, int year)
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
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

    @Override
    public String toString()
    {
        return "id: " + id + " name: " + name + " year: " + year + "\n";

    }
}