package animalApp;

public class Birds implements Animal {
  private int food = 0;
  private int number = 0;
  private String name;
  private int year = 0;

  public Mammals(String name, int number, int year) {
    this.name = name;
    this.number = number;
    this.year = year;
  }

  @Override
  public void move() {
    food--;
  }

  @Override
  public void eat(int units){
    food += units;
  }

  @Override
  public String move() {
    return "Fly";
  }

  @Override
  public String breathe() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n" +
      "Food: " + food;
  }
}
