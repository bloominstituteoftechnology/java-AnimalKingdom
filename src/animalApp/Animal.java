package animalApp;

public abstract class Animal {
  private int number;
  private String name;
  private int year;

  public Animal(int number, String name, int year){
    this.number = number;
    this.name = name;
    this.year = year;
  }

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public String getYear() {
    return year;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public void move() {
    System.out.println("All Move!");
  }

  void move();
  void eat(int units);
  ////All animals consume food the same way
  String move();
  String breathe();
  String reproduce();
}
