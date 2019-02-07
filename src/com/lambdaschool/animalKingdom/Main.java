package com.lambdaschool.animalKingdom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Mammals Panda = new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1778);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1806);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals BigFoot = new Mammals("BigFoot", 2021);

        System.out.println("Panda: + " + Panda);
    }
}
