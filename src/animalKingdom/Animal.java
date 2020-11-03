package animalKingdom;

abstract class Animal
{
  private static int maxId = 0;
  int id, yearNamed;
  String name;

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

}
