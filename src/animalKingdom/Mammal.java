package animalKingdom;

public class Mammal extends Animal
{

  public Mammal(String name, int yearNamed)
  {
    super(name, yearNamed);
  }

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
