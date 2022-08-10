package animals;

import java.util.List;
import java.util.ArrayList;

public class Main
  {
    public static void printAnimal(List<Animal> animal, CheckAnimal tester)
  {
      for (Animal a : animal)
      {
          if (tester.test(a))
          {
              System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear());
          }
      }
  }

  public static void main(String[] args)
    {
        List<Animal> animalArrayList = new ArrayList<>();

        // ++ mammals
        animalArrayList.add(new Mammals("Panda", 1869));
        animalArrayList.add(new Mammals("Zebra", 1778));
        animalArrayList.add(new Mammals("Koala", 1816));
        animalArrayList.add(new Mammals("Sloth", 1804));
        animalArrayList.add(new Mammals("Armadillo", 1758));
        animalArrayList.add(new Mammals("Raccoon", 1758));
        animalArrayList.add(new Mammals("Bigfoot", 2021));

        // ++ birds
        animalArrayList.add(new Birds("Pigeon", 1837));
        animalArrayList.add(new Birds("Peacock", 1821));
        animalArrayList.add(new Birds("Toucan", 1758));
        animalArrayList.add(new Birds("Parrot", 1824));
        animalArrayList.add(new Birds("Swan", 1758));

        // ++ fish
        animalArrayList.add(new Fish("Salmon", 1758));
        animalArrayList.add(new Fish("Catfish", 1817));
        animalArrayList.add(new Fish("Perch", 1758));

        System.out.println("*** ONLY LAMBDA EXPRESSIONS HERE ***");
        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        animalArrayList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(animalArrayList.toString());;

        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalArrayList.toString());;

        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animalArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalArrayList.toString());

        System.out.println();
        System.out.println("*** List only those animals the breathe with lungs ***");
        printAnimal(animalArrayList, a -> a.breathe().equalsIgnoreCase("lungs"));

        System.out.println();
        System.out.println("*** List only those animals that breathe with lungs and were named in 1758 ***");
        printAnimal(animalArrayList, a -> (a.breathe().equalsIgnoreCase("lungs") && a.getYear() == 1758));

        System.out.println();
        System.out.println("*** List only those animals that lay eggs and breathe with lungs ***");
        printAnimal(animalArrayList, a-> (a.reproduce().equalsIgnoreCase("eggs") && a.breathe().equalsIgnoreCase("lungs")));

        System.out.println();
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimal(animalArrayList, a -> (a.getYear() == 1758));

        System.out.println("\n\n\n*** Stretch Goal ***");
        System.out.println();
        System.out.println("*** Within the list of animals, list alphabetically all mammals ***");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimal(animalArrayList, a -> (a instanceof Mammals));
    }
}
