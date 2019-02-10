package com.lambda;

public abstract class Animal {
    private static int maxId = 0;
    public int id;
    private String name;
    private int yearDiscovered;

    public Animal(String name, int yearDiscovered) {
        id = maxId++;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public String consume() {
        return "Consumes";
    }

    public String move() {
        return "Moves";
    }

    public String breathe() {
        return "Breathes";
    }

    public String reproduce() {
        return "Reproduces";
    }

}
