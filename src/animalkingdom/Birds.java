package animalkingdom;

public class Birds extends Animals
{
    public Birds(String name, int yearDiscovered) 
    {
        super(name, yearDiscovered);
    } 

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}