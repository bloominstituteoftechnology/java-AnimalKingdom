package animals;

public abstract class AbstractAnimal 
{
    private static int maxID = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public AbstractAnimal(String name, int yearDiscovered)
    {
        maxID++;
        id=maxID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

}