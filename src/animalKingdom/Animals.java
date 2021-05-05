package animalKingdom;

public abstract class Animals
{

 private static long maxid = 1;
 protected int food;
 protected long id;
 protected String name;
 protected int yearNamed;

 protected String move;
 protected String breathe;
 protected String reproduce;

 public abstract String move();
 public abstract String breathe();
 public abstract String reproduce();

  public String eat()
  {
    food++;
    return "is eating.";
  }

  public Animals(String name, int yearNamed)
  {
    food = 5;
    this.name = name;
    this.yearNamed = yearNamed;
    id = maxid;
    maxid++;
  }

  @Override
  public String toString()
  {
    return "{name: " + name + ", year: " + yearNamed +" } \n";
  }

}
