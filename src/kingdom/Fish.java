package kingdom;

public class Fish extends Animal {
  public Fish(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return does("swims");
  }

  @Override
  public String breath() {
    return does("breathes with its gills");
  }

  @Override
  public String reproduce() {
    return does("produces eggs");
  }
}
