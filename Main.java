package AnimalKingdom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("__________________ Animals listed by year __________________");
        orderByYear(myList);

        System.out.println("__________________ Animals listed alphabetically __________________");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        for (Animal ani : myList) System.out.println(ani.getName());

        System.out.println("__________________ Animals listed by locomotion __________________");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        for (Animal ani : myList) System.out.println(ani.getName() + " : " + ani.move());

        System.out.println("__________________ Animals the breathe with lungs __________________");
        List<Animal> filtered = myList.stream().filter(a -> a.breathe() == "lungs").collect(Collectors.toList());
        filtered.forEach(ani -> System.out.println(ani.getName()));

        System.out.println("__________________ Animals the breathe with lungs and were named in 1758 __________________");
        List<Animal> filtered2 = myList.stream().filter(a -> a.breathe() == "lungs" && a.getYear() == 1758).collect(Collectors.toList());
        filtered2.forEach(ani -> System.out.println(ani.getName()));

        System.out.println("__________________ Animals the breathe with lungs and lay eggs __________________");
        List<Animal> filtered3 = myList.stream().filter(a -> a.breathe() == "lungs" && a.reproduce() == "eggs").collect(Collectors.toList());
        filtered3.forEach(ani -> System.out.println(ani.getName()));

        System.out.println("__________________ Animals that were named in 1758 listed alphabetically __________________");
        List<Animal> filtered4 = myList.stream().filter(a -> a.getYear() == 1758).collect(Collectors.toList());
        filtered4.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filtered4.forEach(ani -> System.out.println(ani.getName() + " : " + ani.getYear()));

    }
}
