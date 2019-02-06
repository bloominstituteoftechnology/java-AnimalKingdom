package com.harrisonbrock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AnimalImpl> list = new LinkedList<>();
        list.add(new Mammal("Panda", 1869));
        list.add(new Mammal("Zebra", 1778));
        list.add(new Bird("Parrot", 1884));

        for (AnimalImpl animal : list) {
            animal.breath();
            System.out.println("id: " +  animal.getId() + " | " + animal.getName() + " | " + animal.getYearDiscovered());

        }

    }
}
