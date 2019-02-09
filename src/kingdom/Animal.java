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

  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();

  public String consume() {
    return "mouth";
  }

  public String getName() {
    return name;
  }

  public int getYearNamed() {
    return yearDiscovered;
  }

  @Override
  public String toString() {
    return "Animal: " + name + "\n" +
          "Year Discovered: " + yearDiscovered + "\n";
  }
}
