package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
  private static List<Animal> initAnimals() {
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

    return animals;
  }

  private static void workWithData() {
    List<Animal> animals = initAnimals();    

    AnimalUtils.print(
      "Sorted by year", 
      AnimalUtils.sort(
        animals, 
        (a, b) -> b.getYearnamed() - a.getYearnamed()
      )
    );
    
    AnimalUtils.print(
      "Sorted by name", 
      AnimalUtils.sort(
        animals, 
        (a, b) -> a.getName().compareTo(b.getName())
      )
    );
    
    AnimalUtils.print(
      "Filtered by breathe with lungs", 
      AnimalUtils.filter(
        animals, 
        a -> a.breathe() == "lungs"
      )
    );

    AnimalUtils.print(
      "Filtered by breathe with lungs and lays eggs", 
      AnimalUtils.filter(
        animals, 
        a -> a.breathe() == "lungs" && a.reproduce() == "eggs"
      )
    );

    AnimalUtils.print(
      "List alphabetically named in 1758", 
      AnimalUtils.sort(
        AnimalUtils.filter(animals, a -> a.getYearnamed() == 1758), 
        (a, b) -> a.getName().compareTo(b.getName())
      )
    );

    AnimalUtils.print(
      "List mammals aphabetically", 
      AnimalUtils.sort(
        AnimalUtils.filter(
          animals, 
          a -> Mammal.isMammal(a)
        ),
        (a, b) -> a.getName().compareTo(b.getName())
      )
    );
  }

  public static void main(String[] args) {
    workWithData();
  }
}
