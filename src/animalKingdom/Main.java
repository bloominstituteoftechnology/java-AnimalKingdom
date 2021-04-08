package animalKingdom;

import java.util.*;

public class Main
{




  public static void main(String[] args)
  {

    List<Animals> animalsArrayList =  new ArrayList<>();

    animalsArrayList.add(new Mammals("Panda", 1869));
    animalsArrayList.add(new Mammals("Zebra", 1778));
    animalsArrayList.add(new Mammals("Koala", 1816));
    animalsArrayList.add(new Mammals("Sloth", 1804));
    animalsArrayList.add(new Mammals("Armadillo", 1758));
    animalsArrayList.add(new Mammals("Raccoon", 1758));
    animalsArrayList.add(new Mammals("Bigfoot", 2021));

    animalsArrayList.add(new Birds("Pigeon", 1837));
    animalsArrayList.add(new Birds("Peacock", 1821));
    animalsArrayList.add(new Birds("Toucan", 1758));
    animalsArrayList.add(new Birds("Parrot", 1824));
    animalsArrayList.add(new Birds("Swan", 1758));

    animalsArrayList.add(new Fish("Salmon", 1758));
    animalsArrayList.add(new Fish("Catfish", 1817));
    animalsArrayList.add(new Fish("Perch", 1758));

    System.out.println(animalsArrayList);

  }

}
