package animals;

import java.util.List;
import java.util.ArrayList;


public class Main {
    private static List<Animals> filterAnimals(List<Animals> animals, AnimalsTest tester){
        List<Animals> tempList = new ArrayList<>();
        for (Animals a : animals){
            if (tester.test(a)){
                tempList.add(a);
            }
        }
        return tempList;
    }

    public static void main(String[] args){
        //test
        System.out.println("greetings");

        //make mammals
        Mammals panda = new Mammals ("Panda", 1869);
        System.out.println(panda);
        Mammals zebra = new Mammals ("Zebra", 1778);
        System.out.println(zebra);
        Mammals koala = new Mammals ("Koala", 1816);
        System.out.println(koala);
        Mammals sloth = new Mammals ("Sloth", 1804);
        System.out.println(sloth);
        Mammals armadillo = new Mammals ("Armadillo", 1758);
        System.out.println(armadillo);
        Mammals raccoon = new Mammals ("Raccoon", 1758);
        System.out.println(raccoon);
        Mammals bigfoot = new Mammals ("Bigfoot", 2021);
        System.out.println(bigfoot);

        //make birds
        Birds pigeon = new Birds("Pigeon", 1837);
        System.out.println(pigeon);
        Birds peacock = new Birds("Peacock", 1821);
        System.out.println(peacock);
        Birds toucan = new Birds("Toucan", 1758);
        System.out.println(toucan);
        Birds parrot = new Birds("Parrot", 1824);
        System.out.println(parrot);
        Birds swan = new Birds("Swan", 1758);
        System.out.println(swan);

        //make fish
        Fish salmon = new Fish("Salmon", 1758);
        System.out.println(salmon);
        Fish catfish = new Fish("Catfish", 1817);
        System.out.println(catfish);
        Fish perch = new Fish("Perch", 1758);
        System.out.println(perch);

        //create ArrayList 
        List<Animals> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        //Use Lambda expressions to sort the animalList

        // List all the animals in descending order by year named
        System.out.println("\n*** Decending order by year named ***\n");
        animalList.sort((a1, a2) -> a2.getYearNamed() - (a1.getYearNamed()));
        animalList.forEach((a) -> System.out.println(a.getName() + " named in " + a.getYearNamed()));
   
        // List all the animals alphabetically
        System.out.println("\n*** Alphabetically ***\n");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName())); // string method: compareToIgnoreCase(ABC)
        animalList.forEach((a) -> System.out.println(a.getName()));

        // List all the animals order by how they move
        System.out.println("\n*** Animals ordered by how they move ***\n");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach((a) -> System.out.println(a.getName() + " moves by " + a.move()));

        // List only those animals the breath with lungs
        System.out.println("\n*** Animals that breath with lungs ***\n");
        List<Animals> filteredList = filterAnimals(animalList, a -> a.breath().equals("lungs"));
        filteredList.forEach((a) -> System.out.println(a.getName() + " breaths with " + a.breath()));

        //List only those animals that breath with lungs and were named in 1758
        System.out.println("\n*** Animals that breath with lungs and were named in 1758 ***\n");
        filteredList = filterAnimals(animalList, a -> a.breath().equals("lungs") && a.getYearNamed() == 1758);
        filteredList.forEach((a) -> System.out.println(a.getName() + " breaths with " + a.breath() + " and was named in " + a.getYearNamed()));

        //List only those animals that lay eggs and breath with lungs
        System.out.println("\n*** Animals that lay eggs and breath with lungs ***\n");
        filteredList = filterAnimals(animalList, a -> (a.reproduce().equals("eggs") && a.breath().equals("lungs")));
        filteredList.forEach((a)-> System.out.println(a.getName() + " reproduce with " + a.reproduce() + " and breaths with " + a.breath()));

        //List alphabetically only those animals that were named in 1758
        System.out.println("\n*** Alphabetically only those animals that were named in 1758 ***\n");
        filteredList = filterAnimals(animalList, a -> (a.getYearNamed() == 1758));
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a) -> System.out.println(a.getName() + " was named in " + a.getYearNamed()));

        //STRETCH
        System.out.println("\n*** List alphabetically those animals that are mammals ***\n");
        filteredList = filterAnimals(animalList, a -> (a instanceof Mammals));
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a) -> System.out.println(a.getName()));

    }
}



// javac animals/*.java
// jar cvfe animals.jar animals.Main animals/*.class
// java -jar animals.jar