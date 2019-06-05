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
    public String consume() {
        return "Consumes";
    }

    public String move() {
        return "Moves";
    }

    public String breathe() {
        return "Breathes";
    }

    public String reproduce() {
        return "Reproduces";
    }

}