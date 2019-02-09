package kingdom;

public class Bird extends Animal {
  public Bird(String name, int year) {
    super(name, year);
  }

  @Override
  public String move() {
    return does("flies");
  }

  @Override
  public String breath() {
    return does("breathes with its lungs");
  }

  @Override
  public String reproduce() {
    return does("produces eggs");
  }
}
