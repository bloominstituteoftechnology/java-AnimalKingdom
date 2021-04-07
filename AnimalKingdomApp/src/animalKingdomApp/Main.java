package animalKingdomApp;

import java.util.List;

import javax.print.event.PrintEvent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
      List<AnimalsAbstract> animalList = new ArrayList<AnimalsAbstract>();
      animalList.add(new Mammal("Panda", 1869));
      animalList.add(new Mammal("Zebra", 1778));
      animalList.add(new Mammal("Koala", 1816));
      animalList.add(new Mammal("Sloth", 1804));
      animalList.add(new Mammal("Armadillo", 1758));
      animalList.add(new Mammal("Raccoon", 1758));
      animalList.add(new Mammal("Bigfoot", 2021));
      animalList.add(new Birds("Pigeon", 1837));
      animalList.add(new Birds("Peacock", 1821));
      animalList.add(new Birds("Toucan", 1758));
      animalList.add(new Birds("Parrot", 1824));
      animalList.add(new Birds("Swan", 1758));
      animalList.add(new Fish("Salmon", 1758));
      animalList.add(new Fish("Catfish", 1817));
      animalList.add(new Fish("Perch", 1758));
      
      animalList.sort( (a1,a2) -> (a1.getYearNamed() < a2.getYearNamed()) ? 1 : -1);
      
      System.out.println("List all the animals in descending order by year named");
      System.out.println(animalList);

      System.out.println("List all the animals alphabetically");
      animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
      System.out.println(animalList);

      System.out.println("List all the animals order by how they move");
      animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
      System.out.println(animalList);

      

      

      
      
    }
    
}
