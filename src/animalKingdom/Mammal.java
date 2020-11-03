package animalKingdom;

public class Mammal extends Animal
{
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
