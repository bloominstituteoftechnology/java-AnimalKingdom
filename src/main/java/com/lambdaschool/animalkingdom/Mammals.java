package com.lambdaschool.animalkingdom;

public class Mammals  extends AbstractAnimals {

    private String mammalName;
    private int yearDiscovered;

    public Mammals(String mammalName, int yearDiscovered) {
        this.mammalName = mammalName;
        this.yearDiscovered = yearDiscovered;
    }

    public String getAnimalName() {
        return mammalName ;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }
    public String move() {
        return "Swim";
    }
    public String breath() {
        return "Gills";
    }

    public String reproduce() {
        return "Eggs";
    }

    @Override
    public String toString(){
        return "\n Id: " + animalId + "Name: " + mammalName + "Year Named: " + yearDiscovered;
    }
}
