package animalKingdom;

public class Bird extends Animal
{
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
