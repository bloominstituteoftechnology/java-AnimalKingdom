package animalKingdom;

import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    List<Animals> animalList = new ArrayList<>();
    animalList.add(new Birds("Pigeon", 1837));
    animalList.add(new Birds("Peacock", 1821));
    animalList.add(new Birds("Toucan", 1758));
    animalList.add(new Birds("Parrot", 1824));
    animalList.add(new Birds("Swan", 1758));
    animalList.add(new Mammals("Panda", 1869));
    animalList.add(new Mammals("Zebra", 1778));
    animalList.add(new Mammals("Koala", 1816));
    animalList.add(new Mammals("Sloth", 1804));
    animalList.add(new Mammals("Armadillo", 1758));
    animalList.add(new Mammals("Raccoon", 1758));
    animalList.add(new Mammals("Bigfoot"));
    animalList.add(new Fish("Salmon", 1758));
    animalList.add(new Fish("Catfish", 1817));
    animalList.add(new Fish("Perch", 1758));
    // System.out.println(animalList.sort((a1, a2) -> (a1.yearNamed > a2.yearNamed) ? -1 : 1 ));
    animalList.sort((a1, a2) -> (a2.yearNamed - a1.yearNamed));
    System.out.println(animalList);
//look up compareTo()
    //exact same output as Lambda expression above
    // System.out.println(animalList.sort((Animals a1, Animals a2) ->
    // {
    //   if (a1.yearNamed > a2.yearNamed)
    //   {
    //     return 1;
    //   } else
    //   {
    //     return -1;
    //   }
    // }));
    animalList.sort((a1, a2) -> (a2.))

    System.out.println(filterAnimals(animalList, (a) -> a.breathe == "lungs"));

  }

  public static List<Animals> filterAnimals(List<Animals> list, AnimalChecker tester)
  {
    List<Animals> returnList = new ArrayList<>();
    for(Animals a : list)
    {
      if (tester.test(a))
      {
        returnList.add(a);
      }
    }
    return returnList;
  }

}
