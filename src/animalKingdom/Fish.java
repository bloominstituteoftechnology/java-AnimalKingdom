package animalKingdom;

public class Fish extends Animal
{
  @Override
  public String move()
  {
    return "swim";
  }

  @Override
  public String breathe()
  {
    return "gills";
  }

  @Override
  public String reproduce()
  {
    return "eggs";
  }
}
