package kingdom;

public class Bird extends Animal {
  public Bird(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return "flies";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}
