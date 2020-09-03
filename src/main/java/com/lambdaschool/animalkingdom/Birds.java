package com.lambdaschool.animalkingdom;

public class Birds extends AbstractAnimals {
    private String birdName;
    private int yearDiscovered;

    public Birds(String birdName, int yearDiscovered) {
        this.birdName = birdName;
        this.yearDiscovered = yearDiscovered;
    }

    public String getAnimalName() {
        return birdName;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }
    public String move() {
        return "Fly";
    }
    public String breath() {
        return "Lungs";
    }

    public String reproduce() {
        return "Eggs";
    }

    public String classification() {
        return "Bird";
    }

    @Override
    public String toString(){
        return "\n Id: " + animalId + " Name: " + birdName + " Year Named: " + yearDiscovered;
    }
}
