package animalKingdom;

abstract class Animal {
    
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public int getYear()
    {
        return year;
    }
}
