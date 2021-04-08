package animalKingdom;

public class Mammals extends Animals
{

  public Mammals(String name, int year)
  {
    super(name, year);
  }
  @Override
  public String move()
  {
    return "walking";
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
