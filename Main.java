package AnimalKingdom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    public static void orderByYear(ArrayList<Animal> animals) {
        Collections.sort(animals, Comparator.comparingInt(Animal::getYear).reversed());
        for (Animal ani : animals) System.out.println(ani.getName() + " : " + ani.getYear());
    }

    public static void main(String[] args) {

        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(new Mammal("Panda",1869));
        myList.add(new Mammal("Zebra",1778));
        myList.add(new Mammal("Koala",1816));
        myList.add(new Mammal("Sloth",1804));
        myList.add(new Mammal("Armadillo",1758));
        myList.add(new Mammal("Raccoon",1758));
        myList.add(new Mammal("BigFoot",2021));
        myList.add(new Bird("Pigeon",1837));
        myList.add(new Bird("Peacock",1821));
        myList.add(new Bird("Toucan",1758));
        myList.add(new Bird("Parrot",1824));
        myList.add(new Bird("Swan",1758));
        myList.add(new Fish("Salmon",1758));
        myList.add(new Fish("Catfish",1817));
        myList.add(new Fish("Perch",1758));

        System.out.println("__________________ List by year __________________");
        orderByYear(myList);

        System.out.println("__________________ List alphabetically __________________");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        for (Animal ani : myList) System.out.println(ani.getName());

        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        for (Animal ani : myList) System.out.println(ani.getName() + ":" + ani.move());

    }
}
