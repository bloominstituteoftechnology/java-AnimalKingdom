package animalKingdom;

abstract class Animal
{
  private static int maxId = 0;
  public int id, yearNamed;
  public String name;

  public Animal()
  {
    id = maxId++;
  }

  public Animal(String name, int yearNamed)
  {
    id = maxId++;
    this.name = name;
    this.yearNamed = yearNamed;
  }

  public String eatFood()
  {
    return "Om nom nom";
  }

  abstract String move();

  abstract String breathe();

  abstract String reproduce();

  public String describe()
  {
    return String.format("%s %s %s %s %d", name, reproduce(), move(), breathe(), yearNamed);
  }

  @Override
  public String toString()
  {
    return "Animals{id=" + id + ", name='" + name + ", yearNamed=" + yearNamed + "}";
  }
}
