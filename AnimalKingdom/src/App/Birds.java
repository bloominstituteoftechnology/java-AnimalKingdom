package App;

public class Birds extends Animals
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        decFood();
        return "fly";
    }
    @Override
    public String breath ()
    {
        return "lungs";

    }
    @Override
    public String reproduce ()
    {
        return "eggs";

    }
}
