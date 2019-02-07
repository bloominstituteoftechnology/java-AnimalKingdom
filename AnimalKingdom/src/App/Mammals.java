package App;

public class Mammals extends Animals
{
    public Mammals(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move ()
    {
        decFood();
        return "walks";
    }

    @Override
    public String breath ()
    {
        return "lungs";
    }

    @Override
    public String reproduce ()
    {
        return "live births";
    }

}
