package animals;

public class Bird extends AbstractAnimal
{
    public Bird(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }
    @Override
    public String move()
    {
        return "fly";
    }
    @Override
    public String breath()
    {
        return "lungs";
    }
    @Override
    public String reproduce()
        {
            return "eggs";
        }
    
}