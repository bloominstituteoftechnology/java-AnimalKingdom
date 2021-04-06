package animalKingdom;

public class Mammal extends Animal {
  /*
  protected int maxId;
  protected int id;
  protected int energy;
  protected String name;
  protected int year;
  
  */
  // public String getMove();

  public Mammal(String name, int year) {
    super(name, year);
  }

  @Override
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getMove() {
    return "walk";
  }

  @Override
  public String getBreathe() {
    return "lungs";
  }

  @Override
  public String getReproduce() {
    return "live births";
  }

  @Override
  public String toString() {
    return "* Mammal *  Name: " + name + " Year: " + year;
  }
}
