package com.harrisonbrock;

public abstract class AnimalImpl  {
    static int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

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
}
