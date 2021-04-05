package animalKingdom;

abstract class Animal {
  protected static int maxid = 1;
  protected int id;
  protected String name;
  protected int yearnamed;

  public void consumeFood(String food) {
    System.out.println("Consumes: " + food);
  }

  abstract String move();
  abstract String breathe();
  abstract String reproduce();

  @Override
  public String toString() {
    return "Animal {id=" + this.id + ", name=" + this.name + ", yearNamed=" + this.yearnamed + "}";
  }
}
