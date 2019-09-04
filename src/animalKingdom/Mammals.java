package animalKingdom;

public class Mammals extends Animals
{
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live Birth";
    }
}