package kingdom;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
  private static void printAnimals(ArrayList<Animal> animals) {
    animals.forEach(animal -> System.out.println(animal));
  };

  private static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester) {
    animals.forEach(animal -> {
      if (tester.check(animal)) {
        System.out.println(animal);
      }
    });
  };

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();

    animals.add(new Mammal("Panda", 1869));
    animals.add(new Mammal("Zebra", 1778));
    animals.add(new Mammal("Koala", 1816));
    animals.add(new Mammal("Sloth", 1804));
    animals.add(new Mammal("Armadillo", 1758));
    animals.add(new Mammal("Raccoon", 1758));
    animals.add(new Mammal("Bigfoot", 2021));

    animals.add(new Bird("Pigeon", 1837));
    animals.add(new Bird("Peacock", 1821));
    animals.add(new Bird("Toucan", 1758));
    animals.add(new Bird("Parrot", 1824));
    animals.add(new Bird("Swan", 1758));

    animals.add(new Fish("Salmon",  1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));

    System.out.println("List all the animals in descending order by year named\n");
    animals.sort(Comparator.comparingInt(Animal::getYearNamed).reversed());
    printAnimals(animals);

    System.out.println("\nList all the animals alphabetically\n");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animals);

    System.out.println("\nList all the animals order by how they move\n");
    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    printAnimals(animals);

    System.out.println("\nList only those animals that breathe with lungs\n");
    printAnimals(animals, animal -> animal.breathe() == "lungs");

    System.out.println("\nList only those animals that breathe with lungs and were named in 1758\n");
    printAnimals(animals, animal -> animal.breathe() == "lungs" && animal.getYearNamed() == 1758);

    System.out.println("\nList only those animals that lay eggs and breathe with lungs\n");
    printAnimals(animals, animal -> animal.breathe() == "lungs" && animal.reproduce() == "eggs");

    System.out.println("\nList alphabetically only those animals that were named in 1758\n");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animals, animal -> animal.getYearNamed() == 1758);
  }
}
