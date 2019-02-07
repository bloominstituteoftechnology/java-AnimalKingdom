package com.lambdaschool.animalKingdom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<AbstractAnimal> AnimalList = new ArrayList<>();

        Mammals Panda = new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1778);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1806);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals BigFoot = new Mammals("BigFoot", 2021);

        Birds Pigeon = new Birds("Pigeon", 1837);
        Birds Peacock = new Birds("Peacock", 1821);
        Birds Toucan = new Birds("Toucan", 1758);
        Birds Parrot = new Birds("Parrot", 1824);
        Birds Swan = new Birds("Swan", 1758);


        Fish Salmon =  new Fish("Salmon", 1758);
        Fish Catfish =  new Fish("Catfish", 1817);
        Fish Perch =  new Fish("Perch", 1758);

        AnimalList.add(Panda);
        AnimalList.add(Zebra);
        AnimalList.add(Koala);
        AnimalList.add(Sloth);
        AnimalList.add(Armadillo);
        AnimalList.add(Raccoon);
        AnimalList.add(BigFoot);

        AnimalList.add(Pigeon);
        AnimalList.add(Peacock);
        AnimalList.add(Toucan);
        AnimalList.add(Parrot);
        AnimalList.add(Swan);

        AnimalList.sort((o1,o2) -> o1.getYear() - o2.getYear());
        System.out.println(AnimalList.toString());


        System.out.println("ANIMALS ALPHABETICAL ORDER:\n");
        AnimalList.sort((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        System.out.println(AnimalList);
    }
}
