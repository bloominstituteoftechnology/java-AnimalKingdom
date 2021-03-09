package animals;

public class Bird extends Animals
{

    private int id;
    private String name;
    private int year;

    public Bird(int id, String name, int year)
    {
        super(id, name, year);
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String move()
    {
        return "Fly";
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "eggs";
    }

}
