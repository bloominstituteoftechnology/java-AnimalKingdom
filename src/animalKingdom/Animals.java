package animalKingdom;

public abstract class Animals
{
    private static int maxId = 0;
    private int id;
    String name;
    int year;

    public Animal(String name, int year)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}