package animalApp;

public class Mammals implements Animal, Body {
  private int food = 0;
  private int number = 0;
  private String name;
  private int year = 0;

  public Mammals(String name, int number, int year) {
    this.name = name;
    this.number = number;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return "Walk";
  }

  @Override
  public String breathe() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Live Births";
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n" +
      "Food: " + food;
  }
}
