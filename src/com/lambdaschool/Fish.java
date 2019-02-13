package com.lambdaschool;

public class Fish extends Animal {
    @Override
    public String move() {
        return "Swim";
    }

    @Override
    public String breathe() {
        return "Gills";
    }

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}
