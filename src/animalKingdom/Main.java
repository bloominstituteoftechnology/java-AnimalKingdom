package animalKingdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    /*
    //filter list
    public static List<Animal> filter = new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal tester) {

        filter.clear();
        for (Animal a : animals) { if (tester.test(a)) { filter.add(a); } }

    }
    */

    public static void main(String[] args)
    {
        System.out.println(" \n\n\n --- Michael's Ark ---");

        //init Animals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal racoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        //fill ark
        List<AbstractAnimal> ark = new ArrayList<>();
        ark.addAll(Arrays.asList(panda, zebra, koala, sloth, armadillo, racoon, bigfoot, pigeon, peacock, toucan, swan, parrot, salmon, catfish, perch));

        print(" \n *Specimens by year of discovery* \n ");
        ark.sort((a1, a2) -> a2.getYear() - a1.getYear());
        printList(ark);

        print(" \n *Specimens in alphabetical order* \n ");
        ark.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        printList(ark);

        print(" \n *Specimens by movement type* \n ");
        ark.sort((a1, a2) -> a1.move().compareTo(a2.move()));
        ark.forEach(animal -> System.out.println(animal.move() + " - " + animal.getName()));

        print(" \n *Specimens with lungs* \n ");
        ark.stream().filter(a -> a.breath() == "lungs").forEach(a -> System.out.println(a.getName() + "s have lungs."));

        print(" \n *Specimens discovered in 1758 that breath with lungs* \n ");
        ark.stream().filter(a -> a.breath() == "lungs" && a.getYear() == 1758).forEach(a -> System.out.println(a.getName()));

        print(" \n *Specimens that lay eggs and breath with lungs* \n ");
        ark.stream().filter(a -> a.breath() == "lungs" && a.reproduce() == "eggs").forEach(a -> System.out.println(a.getName()));

        print(" \n *Specimens discovered in 1758 in alphabetical order* \n ");
        //sort alphabetically
        ark.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        ark.stream().filter(a -> a.getYear() == 1758).forEach(a -> System.out.println(a.getName()));

        /*
        print(" \n *Specimen class names* \n ");
        ark.stream().filter(a -> a.getClass().getSimpleName() == "Mammal").forEach(a -> System.out.println(a.getName()));
        */

    }

    private static void printList(List<AbstractAnimal> list){ list.forEach(animal -> System.out.println(animal.getName() + " - " + animal.getYear()));}
    private static void print(String str){ System.out.println(str); }

    

    //how do i do this?
    //private static void letThereBeAnimals(){}


}