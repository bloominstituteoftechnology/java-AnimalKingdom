package animalkingdom;

public class Mammals extends Animals
{
    public Mammals(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}