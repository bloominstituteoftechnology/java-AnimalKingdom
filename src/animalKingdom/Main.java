package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    workWithData();
  }

  private static void workWithData() {
    List<Animal> animals = new ArrayList<>();

    // Create mammals
    animals.add(new Mammal("Panda", 1869));
    animals.add(new Mammal("Zebra", 1778));
    animals.add(new Mammal("Koala", 1816));
    animals.add(new Mammal("Sloth", 1804));
    animals.add(new Mammal("Armadillo", 1758));
    animals.add(new Mammal("Raccoon", 1758));
    animals.add(new Mammal("Bigfoot", 2021));

    // Create birds
    animals.add(new Bird("Pigeon", 1837));
    animals.add(new Bird("Peacock", 1821));
    animals.add(new Bird("Toucan", 1758));
    animals.add(new Bird("Parrot", 1824));
    animals.add(new Bird("Swan", 1758));
    
    System.out.println(animals);
  }
}
