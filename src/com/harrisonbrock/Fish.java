package com.harrisonbrock;

public class Fish extends AnimalImpl{

    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "fish swim";
    }

    @Override
    public String breath() {
        return "fish gills";
    }

    @Override
    public String reproduce() {
        return "fish eggs";
    }

    @Override
    public double eat(double amount) {
        return 0;
    }

}
