package com.lambdaschool;

public class Bird extends Animal {
    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}
