package kingdom;

public class Mammal extends Animal {
  public Mammal(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return "walks";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "live births";
  }
}
