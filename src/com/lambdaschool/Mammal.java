package com.lambdaschool;

public class Mammal extends Animal {
    @Override
    public String move() {
        return "Walk";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String reproduce() {
        return "Live birth";
    }
}
