package animalKingdom;

public class Fish extends Animals
{
    public Fish(String name, int year)
    {
        super(name, year);
    }
    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Gills";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }
}