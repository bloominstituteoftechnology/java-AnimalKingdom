package AnimalKingdom;

import java.util.ArrayList;
import java.util.List;



public class Main
{

    public static ArrayList<Animals> filtered = new ArrayList<Animals>();

    public static void printAnimals(List<Animals> animals, CheckAnimal tester)
    {
        filtered.clear();

        for(Animals animal: animals)
        {
            if(tester.test(animal))
            {
                System.out.println(animal.getName() + " " + animal.getYearDiscovered()+ " " + animal.move()+ " " + animal.breath()+ " " + animal.reproduce());
                filtered.add(animal);
            }
        }
    }

    private static void animals()
    {
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("armadillo", 1758);
        Mammals raccoon = new Mammals("raccoon", 1758);
        Mammals bigfoot = new Mammals("bigfoot", 2021);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("perch", 1758);

        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("peacock", 1821);
        Birds toucan = new Birds("toucan", 1758);
        Birds parrot = new Birds("parrot", 1824);
        Birds swan = new Birds("swan", 1758);

        // Arrays
        List<Animals> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);
        

        System.out.println("\nPrint in Descending order by Year \n");
        animals.sort((a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered());
        animals.forEach(animal -> System.out.print(animal.getYearDiscovered() + "\n"));

        System.out.println("\n Print Alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(animal -> System.out.print(animal.getName() + "\n"));

        
        System.out.println("\n Print By Movement\n");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(animal -> System.out.print(animal.getName() + " " + animal.move() + "\n"));
                
        System.out.println("\n Print Animals that Breathe with Lungs\n");
        printAnimals(animals, animal -> animal.breath() == "lungs");

        System.out.println("\nBreathes with Lungs and named in 1758\n");
        printAnimals(animals, animal -> animal.breath() == "lungs" && animal.getYearDiscovered() == 1758);

        System.out.println("\nLays eggs and breathes with lungs\n");
        printAnimals(animals, animal -> animal.breath() == "lungs" && animal.reproduce() == "eggs");

        System.out.println("\nNamed in 1758 alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animals, animal -> animal.getYearDiscovered() == 1758);

        // Stretch Goals
        System.out.println("\nMammals Alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animals, animal -> animal.getClass() == bigfoot.getClass());

    }


    public static void main(String[] args)
    {
        animals();
    }
}