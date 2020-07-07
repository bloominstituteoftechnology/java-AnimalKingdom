package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main 
{
    
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
        System.out.println(animal);

    }
}