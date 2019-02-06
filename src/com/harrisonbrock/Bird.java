package com.harrisonbrock;

public class Bird extends AnimalImpl implements Animal{

    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }
    @Override
    public String move() {
        return null;
    }

    @Override
    public String breath() {
        return "bird lungs";
    }

    @Override
    public String reproduce() {
        return "bird eggs";
    }

    @Override
    public double eat(double amount) {
        return 0;
    }

}
