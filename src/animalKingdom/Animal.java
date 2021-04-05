package animalKingdom;

abstract class Animal {
  protected int id;
  protected String name;
  protected int yearnamed;

  public void consumeFood(String food) {
    System.out.println("Consumes: " + food);
  }

  abstract String move();
  abstract String breathe();
  abstract String reproduce();
}
