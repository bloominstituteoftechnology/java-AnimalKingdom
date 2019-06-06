package animals;

public abstract class AbstractAnimal 
{
    private static int maxID = 0;

    int id;
    String name;
    int yearDiscovered;
    
    public AbstractAnimal(String name, int yearDiscovered)
    {
        maxID++;
        id=maxID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
    public String consume()
    {
        return "Food";
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getyearDiscovered()
    {
        return yearDiscovered;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + " Year Named: " + getyearDiscovered() + "\n";
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}


