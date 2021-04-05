package animalKingdom;

public class Mammal extends Animal {
  public Mammal(String name, int yearnamed) {
    this.id = maxid;
    maxid++;

    this.name = name;
    this.yearnamed = yearnamed;
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
