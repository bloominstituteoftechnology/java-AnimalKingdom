package com.harrisonbrock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        for (AnimalImpl animal : list) {
            animal.breath();
            System.out.println("id: " +  animal.getId() + " | " + animal.getName() + " | " + animal.getYearDiscovered() + " | " + animal.breath());

        }

    }
}
