package animalKingdom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface FilterAnimals {
  boolean test(Animal animal);
}

public class AnimalUtils {
  public static List<Animal> filter(List<Animal> aList, FilterAnimals aFilterAnimals) {
    List<Animal> filteredList = new ArrayList<>();
    for (Animal a : aList) {
      if (aFilterAnimals.test(a)) {
        filteredList.add(a);
      }
    }
    return filteredList;
  }
}
