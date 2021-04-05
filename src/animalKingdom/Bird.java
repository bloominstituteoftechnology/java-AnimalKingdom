package animalKingdom;

public class Bird extends Animal {
  public Bird(String name, int yearnamed) {
    this.id = maxid;
    maxid++;

    this.name = name;
    this.yearnamed = yearnamed;
  }

  public String reproduce() {
    return "eggs";
  }

  public String move() {
    return "flying";
  }

  public String breathe() {
    return "lungs";
  }
}
