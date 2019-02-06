package com.harrisonbrock;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<AnimalImpl> list = new LinkedList<>();
        list.add(new Mammal("Panda", 1869));
        list.add(new Mammal("Zebra", 1778));
        list.add(new Mammal("Koala", 1816));
        list.add(new Mammal("Sloth", 1804));
        list.add(new Mammal("Raccoon", 1758));
        list.add(new Mammal("Bigfoot", 2021));

        list.add(new Bird("Parrot", 1884));
        list.add(new Bird("Pigeon", 1837));
        list.add(new Bird("Peacock", 1821));
        list.add(new Bird("Toucan", 1758));
        list.add(new Bird("Swan", 1758));

        list.add(new Fish("Salmon", 1758));
        list.add(new Fish("Catfish", 1821));
        list.add(new Fish("Perch", 1758));


//        for (AnimalImpl animal : list) {
//            animal.breath();
//            System.out.println("id: " +  animal.getId() + " | " + animal.getName() + " | " + animal.getYearDiscovered() + " | " + animal.breath());
//
//        }
//        List all the animals in descending order by year named
        list.sort((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName()));
        list.forEach(name -> System.out.println(name.getName()));

        System.out.println("================================================================================================");
//        List all the animals alphabetically

        list.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        list.forEach(name -> System.out.println(name.getName()));
        System.out.println("=================================================================================================");
//        List all the animals order by how they move
        list.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        list.forEach(name -> System.out.println(name.getName() + " | " + name.move()));

        System.out.println("=====================================================================================================");
//        List only those animals the breath with lungs
        List<AnimalImpl> newList = list.stream().filter( a -> a.breath() == "lungs").collect(Collectors.toList());
        newList.forEach(name -> System.out.println(name.getName() + " | " + name.breath()));

        System.out.println("======================================================================================================");
//        List only those animals that breath with lungs and were named in 1758
        newList = list.stream().filter( a -> a.breath() == "lungs" && a.getYearDiscovered() == 1758).collect(Collectors.toList());
        newList.forEach(name -> System.out.println(name.getName() + " | " + name.breath() + " | " + name.getYearDiscovered()));

        System.out.println("==========================================================================================");
//        List only those animals that lay eggs and breath with lungs
        newList = list.stream().filter( a -> a.breath() == "lungs" && a.reproduce() == "eggs").collect(Collectors.toList());
        newList.forEach(name -> System.out.println(name.getName() + " | " + name.breath() + " | " + name.reproduce()));

        System.out.println("===============================================================================================");
//        List alphabetically only those animals that were named in 1758
        newList = list.stream().filter( a -> a.getYearDiscovered() == 1758).collect(Collectors.toList());
        newList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        newList.forEach(name -> System.out.println(name.getName()));

    }
}
