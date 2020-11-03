package animalKingdom;

public class Bird extends Animal
{
  public Bird(String name, int yearNamed)
  {
    super(name, yearNamed);
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
