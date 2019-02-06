package com.harrisonbrock;

public class Mammal extends AnimalImpl implements Animal {

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }


    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "mammal lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public double eat(double amount) {
        return 0.0;
    }
}
