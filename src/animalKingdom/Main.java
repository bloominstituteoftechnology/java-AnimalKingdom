package animalKingdom;

import java.util.List;
import java.util.ArrayList;
// import java.util.Collections;

public class Main 
{
    public static List<Animal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<Animal> anm, CheckAnimal tester)
    {
        filteredList.clear();

        for (Animal a : anm)
        {
            if (tester.test(a))
            {
                System.out.println(a);
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] arg)
    {
        System.out.println("*** Animal Kingdom ***");
        System.out.println();

        
        Mammal panda = new Mammal(1, "Panda", 1869);
        Mammal zebra = new Mammal(2, "Zebra", 1778);
        Mammal koala = new Mammal(3, "Koala", 1816);
        Mammal sloth = new Mammal(4, "Sloth", 1804);
        Mammal armadillo = new Mammal(5, "Armadillo", 1758);
        Mammal racoon = new Mammal(6, "Racoon", 1758);
        Mammal bigfoot = new Mammal(7, "Bigfoot", 2021);

        Birds pigeon = new Birds(8, "Pigeon", 1837);
        Birds peacock = new Birds(9, "Peacock", 1821);
        Birds toucan = new Birds(10, "Toucan", 1758);
        Birds parrot = new Birds(11, "Parrot", 1824);
        Birds swan = new Birds(12, "Swan", 1758);
        
        Fish salmon = new Fish(13, "Salmon", 1758);
        Fish catfish = new Fish(14, "Catfish", 1817);
        Fish perch = new Fish(15, "Perch", 1758);

        List<Animal> animal = new ArrayList<>();

        animal.add(panda);
        animal.add(zebra);
        animal.add(koala);
        animal.add(sloth);
        animal.add(armadillo);
        animal.add(racoon);
        animal.add(bigfoot);
        animal.add(pigeon);
        animal.add(peacock);
        animal.add(toucan);
        animal.add(parrot);
        animal.add(swan);
        animal.add(salmon);
        animal.add(catfish);
        animal.add(perch);

        System.out.println();
        System.out.println("*** by year ***");
        animal.sort((Animal a1, Animal a2) -> Integer.compare(a2.getYear(), a1.getYear()));
        System.out.println(animal);
        System.out.println();
        System.out.println("***Alphabetically***");
        animal.sort((Animal a1, Animal a2) -> a1.getName().compareTo(a2.getName()));
        System.out.println(animal);
        System.out.println();
        System.out.println("*** how they move ***");
        animal.sort((Animal a1, Animal a2) -> a1.move().compareTo(a2.move()));
        System.out.println(animal);
        System.out.println();
        System.out.println("*** Breath with lungs ***");
        filterAnimal(animal, a -> a.breath() == "Lungs");
        System.out.println();
        System.out.println("*** Lungs and Eggs ***");
        filterAnimal(animal, a -> (a.breath() == "Lungs") && (a.reproduce() == "Eggs"));
        System.out.println();
        System.out.println("*** lungs and 1978 ***");
        filterAnimal(animal, a -> (a.breath() == "Lungs") && (a.getYear() == 1758));
        System.out.println();
        System.out.println("*** 1978 ***");
        filterAnimal(animal, a -> a.getYear() == 1758);


    }
}