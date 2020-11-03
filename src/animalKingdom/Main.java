package animalKingdom;

import java.util.ArrayList;
import java.util.List;

class Main
{
  public static void main(String[] args)
  {
    List<Animal> animals = new ArrayList<>();
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
    animals.add(new Fish("Salmon", 1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));

    animals.sort((x1, x2) -> x2.yearNamed - x1.yearNamed);
    System.out.println(animals + "\n");

    animals.sort((x1, x2) -> x1.name.compareToIgnoreCase(x2.name));
    System.out.println(animals + "\n");

    animals.sort((x1, x2) -> x1.move().compareToIgnoreCase(x2.move()));
    System.out.println(animals + "\n");

    animals.forEach(a -> System.out.println(a.describe()));
  }
}