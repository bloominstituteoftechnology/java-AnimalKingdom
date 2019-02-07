package App;

public class Fish extends Animals
{
    public Fish(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        decFood();
        return "swim";
    }

    @Override
    public String breath ()
    {
        return "gills";
    }

    @Override
    public String reproduce ()
    {
        return "eggs";
    }
}

