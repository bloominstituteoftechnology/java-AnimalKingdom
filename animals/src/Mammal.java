package animals;

public class Mammal extends Animals
{

    private int id;
    private String name;
    private int year;

    public Mammal(int id, String name, int year)
    {
        super(id, name, year);
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String move()
    {
        return "Walk";
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "live births";
    }

}
