package animals;

public class Fish extends AbstractAnimal
{
    @Override
    public string move()
    {
        return "swim";
    }
    @Override
    public String breath()
    {
        return "gills";
    }
    @Override
    public String reproduce()
    {
        return "eggs";
    }
    
}