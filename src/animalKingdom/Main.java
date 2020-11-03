package animalKingdom;

import java.util.ArrayList;
import java.util.List;

class Main
{
  public static void main(String[] args)
  {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Mammal("Panda", 1869));
    animals.forEach(v -> System.out.println(v.describe()));
  }
}