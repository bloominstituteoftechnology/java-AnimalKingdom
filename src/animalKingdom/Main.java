package animalKingdom;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class SortByYear implements Comparator<Animal> {
  public int compare(Animal a, Animal b) {
    return b.getYearnamed() - a.getYearnamed();
  }
}

class SortAnimals {
  private Comparator<Animal> comparator;

  public SortAnimals(Comparator<Animal> comparator) {
    this.comparator = comparator;
  }

  public List<Animal> sort(List<Animal> animals) {
    ArrayList<Animal> copy = new ArrayList<>();
    animals.forEach((a) -> {
      copy.add(a);
    });

    Collections.sort(copy, this.comparator);

    return copy;
  }
}

public class Main {
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

    // Create fish 
    animals.add(new Fish("Salmon", 1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));

    List<Animal> sortedByYear = new SortAnimals(new SortByYear()).sort(animals);
    System.out.println(sortedByYear);
  }

  public static void main(String[] args) {
    workWithData();
  }
}
