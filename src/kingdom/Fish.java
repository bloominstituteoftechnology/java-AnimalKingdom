package kingdom;

public class Fish extends Animal {
  public Fish(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return "swims";
  }

  @Override
  public String breathe() {
    return "gills";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}
