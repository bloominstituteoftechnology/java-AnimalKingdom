package animalKingdom;

public class Birds extends Animals
{

  public Birds (String name, int yearNamed)
  {
    super(name, yearNamed);
    move = "flying";
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
