package kingdom;

public abstract class Animal {
  private static int currentId = 0;
  private int id;
  private String name;
  private int yearDiscovered;

  public Animal(String name, int year) {
    id = currentId++;
    this.name = name;
    yearDiscovered = year;
  }

  public String does(String action) {
    return name + " " + action + "!";
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();

  public String eatFood(String food) {
    return name + " eats " + food + ".";
  }
}
