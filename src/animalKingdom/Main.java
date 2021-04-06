package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
  
  private static List<Animal> filterAnimals(List<Animal> myList, CheckAnimal tester) {
    List<Animal> tempList = new ArrayList<>();
    for (Animal a : myList) {
      if (tester.test(a)) {
        tempList.add(a);
      }
    }
    return tempList;
  }
  public static void main(String[] args) {
    Mammal panda = new Mammal("panda", 1869);
    Mammal zebra = new Mammal("zebra", 1778);
    Mammal koala = new Mammal("koala", 1816);
    Mammal sloth = new Mammal("sloth", 1804);
    Mammal armadillo = new Mammal("armadillo", 1758);
    Mammal raccoon = new Mammal("raccoon", 1758);
    Mammal bigfoot = new Mammal("bigfoot", 2021);
    // System.out.println(panda.id);

    Bird pigeon = new Bird("pigeon", 1837);
    Bird peacock = new Bird("peacock", 1821);
    Bird toucan = new Bird("toucan", 1758);
    Bird parrot = new Bird("parrot", 1824);
    Bird swan = new Bird("swan", 1758);
    
    Fish salmon = new Fish("salmon", 1758);
    Fish catfish = new Fish("catfish", 1817);
    Fish perch = new Fish("perch", 1758);

    List<Animal> animals = new ArrayList<>();

    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);

    //test animal (perch)
    // System.out.println(perch.getName());
    // System.out.println(perch.getYear());
    // System.out.println(perch.getBreathe());
    // System.out.println(perch.getMove());
    // System.out.println(perch.getReproduce());

    //print all animals
    // animals.forEach((animal) -> System.out.println(animal));

    //print all the animals in descending order by year named
    animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
    animals.forEach((animal) -> System.out.println(animal));
    System.out.println("\n\n");

    // List all the animals alphabetically
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach((animal) -> System.out.println(animal));
    System.out.println("\n\n");

    //List all the animals order by how they move
    animals.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
    animals.forEach((animal) -> System.out.println(animal));
    System.out.println("\n\n");

    // List only those animals the breath with lungs
    List<Animal> withLungList = filterAnimals(animals, (a) -> a.getBreathe() == "lungs");
    withLungList.forEach((a) -> System.out.println(a));
    System.out.println("\n\n");

    //List only those animals that breath with lungs and were named in 1758
    List<Animal> lungs1758 = filterAnimals(withLungList, (a) -> a.getYear() == 1758);
    lungs1758.forEach((a) -> System.out.println(a));
    System.out.println("\n\n");

    //List only those animals that lay eggs and breath with lungs
    List<Animal> eggsLungsList = filterAnimals(withLungList, (a) -> a.getReproduce() == "eggs");
    eggsLungsList.forEach((a) -> System.out.println(a));
    System.out.println("\n\n");

    //List alphabetically only those animals that were named in 1758
    List<Animal> year1758Animals = filterAnimals(animals, (a) -> a.getYear() == 1758);
    year1758Animals.forEach((a) -> System.out.println(a));

  }
}
