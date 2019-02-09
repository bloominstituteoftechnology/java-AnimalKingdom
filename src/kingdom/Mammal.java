package kingdom;

public class Mammal extends Animal {
  public Mammal(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return does("walks");
  }

  @Override
  public String breath() {
    return does("breathes with its lungs");
  }

  @Override
  public String reproduce() {
    return does("live births its child(ren)");
  }
}
