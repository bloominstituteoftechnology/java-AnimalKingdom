package animalKingdom;

public class Mammal extends Animal {
  private static int maxid = 1;

  public Mammal(String name, int yearnamed) {
    this.id = maxid;
    maxid++;
  }

  @Override
  public String reproduce() {
    return "live birth";
  }

  @Override
  public String move() {
    return "waliking";
  }

  @Override
  public String breathe() {
    return "lungs";
  }
}
