package animalKingdom;

public class Mammals extends Animals
{
  public Mammals(String name, int yearNamed)
  {
    super(name, yearNamed);
    move = "walking";
    breathe = "lungs";
    reproduce = "eggs";
  }

  @Override
  public String move()
  {
    return move;
  }

  @Override
  public String breathe()
  {
    return breathe;
  }

  @Override
  public String reproduce()
  {
    return reproduce;
  }


}
