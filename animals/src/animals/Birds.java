package animals;

public class Birds extends AbstractAnimal
{
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