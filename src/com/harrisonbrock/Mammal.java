package com.harrisonbrock;

public class Mammal extends AnimalImpl {

    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }


    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
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
