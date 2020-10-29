package animalApp;

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void printAnimals(List<Animals> animals, CheckAnimal tester)
  {
      for (Animals a : animals)
      {
          if (tester.test(a))
          {
            System.out.println(a.getName() + " " + a.reproduce() +
            " " + a.move() + " " + a.breath() + " " +
            a.getYear());
          }
      }
  }

  public static void main(String[] args)
  {
    List<Animals> animalsArrayList = new ArrayList<>();

    // add the mammals
    animalsArrayList.add(new Mammals("Panda", 1869));
    animalsArrayList.add(new Mammals("Zebra", 1778));
    animalsArrayList.add(new Mammals("Koala", 1816));
    animalsArrayList.add(new Mammals("Sloth", 1804));
    animalsArrayList.add(new Mammals("Armadillo", 1758));
    animalsArrayList.add(new Mammals("Raccoon", 1758));
    animalsArrayList.add(new Mammals("Bigfoot", 2021));

    // add the birds
    animalsArrayList.add(new Birds("Pigeon", 1837));
    animalsArrayList.add(new Birds("Peacock", 1821));
    animalsArrayList.add(new Birds("Toucan", 1758));
    animalsArrayList.add(new Birds("Parrot", 1824));
    animalsArrayList.add(new Birds("Swan", 1758));
  }

    //add the Fish
    animalsArrayList.add(new Fish("Salmon", 1758));
    animalsArrayList.add(new Fish("Catfish", 1817));
    animalsArrayList.add(new Fish("Perch", 1758));

    ///MVP Printouts

    System.out.println();
    System.out.println("all animals in descending order by year they were named");
    animalsArrayList.sort((a1, a2) ->
    a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println(animalsArrayList.toString());

    System.out.println();
    System.out.println("animals in order of their movement type");
    animalsArrayList.sort((a1, a2) ->
    a1.move().compareToIgnoreCase(a2.move()));
    System.out.println(animalsArrayList.toString());

    System.out.println();
    System.out.println("animals that breathe with lungs");
    printAnimals(animalsArrayList, a ->
    a.breathe().equalsIgnoreCase("lungs"));

    System.out.println();
    System.out.println("animals that breath with lungs and were named in 1758");
    printAnimals(animalsArrayList, a -> (a.breath().equalsIgnoreCase("lungs") && a.getYear() == 1758));

    System.out.println();
    System.out.println("animals that lay eggs and breathe with lungs");
    printAnimals(animalsArrayList, a->
    (a.reproduce().equalsIgnoreCase("eggs") &&
    a.breathe().equalsIgnoreCase("lungs")));

    System.out.println();
    System.out.println("animals named in 1758, in alphabetical order");
    animalsArrayList.sort((a1, a2) ->
    a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalsArrayList, a -> (a.getYear() == 1758));

    System.out.println("\n\n\n*** Stretch Goal ***");
    System.out.println();
    System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
    animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalsArrayList, a -> (a instanceof Mammals));
  }
}
