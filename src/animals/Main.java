package animals;
import java.util.*;


public class Main 
{


    private static List<Animal> filteredAnimal(List<Animal> theList, CheckAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();

        for (Animal v: theList)
        {
            if( tester.test(v))
            {
                tempList.add(v);
            }
        }

        return tempList;
    }

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


        System.out.println("\n*** sort by Year Named");
        animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        animalList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** sort by Name");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** sort by Move");
        animalList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        animalList.forEach((a) -> System.out.println(a));

        //Filtered Lists
        List<Animal> filteredList = new ArrayList<>();
        filteredList = filteredAnimal(animalList, (a) -> a.getBreath() == "with lungs");
        System.out.println("\n*** sort by Lungs");
        filteredList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** sort by Lungs and 1758");
        filteredList = filteredAnimal(animalList, (a) -> a.getBreath() == "with lungs" && a.getYearNamed() == 1758);
        filteredList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** sort by Lay Eggs and Breath with lungs");
        filteredList = filteredAnimal(animalList, (a) -> a.getBreath() == "with lungs" && a.getReproduce() == "via eggs");
        filteredList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList = filteredAnimal(animalList, (a) -> a.getYearNamed() == 1758 );
        filteredList.forEach((a) -> System.out.println(a));
        System.out.println("\n*** *** For the list of animals, list alphabetically those animals that are mammals ***");
        filteredList = filteredAnimal(animalList, (a) -> a.getClass() == Mammals.class);
        filteredList.forEach((a) -> System.out.println(a));
    }
}