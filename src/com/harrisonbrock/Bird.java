package com.harrisonbrock;

public class Bird extends AnimalImpl{

    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }
    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public double eat(double amount) {
        return 0;
    }

}
