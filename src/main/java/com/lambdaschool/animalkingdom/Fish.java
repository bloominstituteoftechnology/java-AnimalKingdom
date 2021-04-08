package com.lambdaschool.animalkingdom;

public class Fish extends AbstractAnimals {
    private String fishName;
    private int yearDiscovered;

    public Fish(String fishName, int yearDiscovered) {
        this.fishName = fishName;
        this.yearDiscovered = yearDiscovered;
    }

    public String getAnimalName() {
        return fishName ;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }
    public String move() {
        return "Swims";
    }
    public String breath() {
        return "Gills";
    }

    public String reproduce() {
        return "Eggs";
    }

    public String classification() {
        return "Fish";
    }

    @Override
    public String toString(){
        return "\n Id: " + animalId + " Name: " + fishName + " Year Named: " + yearDiscovered;
    }

}
