package com.lambdaschool;

public abstract class Animal {
    private static int maxNumber = 0;
    private int number;
    private String name;
    private int yearDiscovered;

    public void eatFood() {
        System.out.println("Yummy!");
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();


    public Animal(String name, int yearDiscovered) {
        maxNumber++;
        number = maxNumber;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
}
