package animalKingdom;

public class Mammal extends Animal {
  private static String reproductionType = "live birth";
  private static String moveType = "walking";
  private static String breathingType = "lungs";

  public Mammal(String name, int yearnamed) {
    this.id = maxid;
    maxid++;

    this.name = name;
    this.yearnamed = yearnamed;
  }

  @Override
  public String reproduce() {
    return Mammal.reproductionType;
  }

  @Override
  public String move() {
    return Mammal.moveType;
  }

  @Override
  public String breathe() {
    return Mammal.breathingType;
  }

  public static boolean isMammal(Animal animal) {
    return animal.reproduce() == Mammal.reproductionType
      && animal.move() == Mammal.moveType
      && animal.breathe() == Mammal.breathingType;
  }
}
