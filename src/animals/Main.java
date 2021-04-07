package animals;
import java.util.*;


public class Main 
{
    private static List<Animal> filteredList(List<Animal> theList, CheckAnimal tester)

    public static void main(String[] args){

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Mammals("Panda", 1869));
        animalList.add(new Mammals("Zebra", 1778));
        animalList.add(new Mammals("Koala", 1816));
        animalList.add(new Mammals("Sloth", 1804));
        animalList.add(new Mammals("Armadillo", 1758));
        animalList.add(new Mammals("Raccoon", 1758));
        animalList.add(new Mammals("Bigfoot", 2021));
        animalList.add(new Birds("Pigeon", 1837));
        animalList.add(new Birds("Peacock", 1821));
        animalList.add(new Birds("Toucan", 1758));
        animalList.add(new Birds("Parrot", 1824));
        animalList.add(new Birds("Swan", 1758));
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));
        // System.out.println(animalList);

        animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        animalList.forEach((a) -> System.out.println(a));
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach((a) -> System.out.println(a));
        
        List<Animal> filteredList = new ArrayList<>();
    }
}