package animalKingdom;

public class Fish extends Animals
{

  public Fish (String name, int yearNamed)
  {

    super(name, yearNamed);
    move = "swimming";
    breathe = "gills";
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
