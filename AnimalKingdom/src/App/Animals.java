package App;

public abstract class Animals
{
    private int food = 0;
    private int id = 0;
    private static int maxid = 0;
    private String name;
    private int year;

    public Animals(String name, int year)
    {
        maxid += 1;
        id = maxid;
        this.name = name;
        this.year = year;

    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public void decFood()
    {
        this.food -= 1;
    }

    public void Eat(int food)
    {
        this.food += food;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();





}
