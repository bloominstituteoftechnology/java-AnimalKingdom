package animalKingdom;

public class Birds extends Animals
{
    public Birds(String name, int year)
    {
        super(name, year);
    }
    
    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }
}