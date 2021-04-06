package animalKingdom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface FilterAnimals {
  boolean test(Animal animal);
}

public class AnimalUtils {
  private static List<Animal> copy(List<Animal> animals) {
    List<Animal> animalCopy = new ArrayList<>();
    for (Animal animal : animals) {
      animalCopy.add(animal);
    }
    return animalCopy;
  }

  public static List<Animal> filter(List<Animal> animals, FilterAnimals animalFilter) {
    List<Animal> filteredList = new ArrayList<>();
    for (Animal a : animals) {
      if (animalFilter.test(a)) {
        filteredList.add(a);
      }
    }
    return filteredList;
  }

  public static List<Animal> sort(List<Animal> animals, Comparator<Animal> animalComparator) {
    List<Animal> sorted = copy(animals);

    Collections.sort(sorted, animalComparator);

    return sorted;
  }

  public static void print(String title, List<Animal> animals) {
    System.out.println(title + "\n----------");
    for (Animal a : animals) {
      System.out.println(a);
    }
    System.out.println("----------\n");
  }

  
}
