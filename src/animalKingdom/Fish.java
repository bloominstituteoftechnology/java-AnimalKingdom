package animalKingdom;

public class Fish extends Animal {
  public Fish(String name, int yearnamed) {
    this.id = maxid;
    maxid++;

    this.name = name;
    this.yearnamed = yearnamed;
  }

  public String reproduce() {
    return "eggs";
  }

  public String move() {
    return "swimming";
  }

  public String breathe() {
    return "gills";
  }
}
