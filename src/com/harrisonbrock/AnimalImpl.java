package com.harrisonbrock;

public abstract class AnimalImpl implements Animal {
    static int maxId = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public AnimalImpl(String name, int yearDiscovered) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String breath() {
        return null;
    }

    @Override
    public String reproduce() {
        return null;
    }

    @Override
    public double eat(double amount) {
        return 0;
    }
}
