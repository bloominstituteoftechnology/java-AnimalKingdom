package animalKingdom;

abstract class Animal {
  protected static int maxid = 1;
  private int id;
  private String name;
  private int yearnamed;

  public void consumeFood(String food) {
    System.out.println("Consumes: " + food);
  }

  abstract String move();
  abstract String breathe();
  abstract String reproduce();

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearnamed() {
    return yearnamed;
  }

  public void setYearnamed(int yearnamed) {
    this.yearnamed = yearnamed;
  }

  @Override
  public String toString() {
    return "Animal {id=" + this.id + ", name=" + this.name + ", yearNamed=" + this.yearnamed + "}";
  }
}
