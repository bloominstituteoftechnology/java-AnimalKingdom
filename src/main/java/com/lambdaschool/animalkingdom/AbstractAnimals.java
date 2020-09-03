package com.lambdaschool.animalkingdom;

abstract class AbstractAnimals {

    protected int animalFood;
    protected int animalId;
    protected static int maxId = 0;

    public AbstractAnimals() {
        maxId++;
        animalId = maxId;
        animalFood = 25;
    }
    abstract String getAnimalName();

    abstract int getYearDiscovered();

    abstract String move();

    abstract String breath();

    abstract String reproduce();

    abstract String classification();

    int getAnimalId() {
        return animalId;
    }

    void eatFood(int i) {
        animalFood = animalFood - i;
    }

    int getFoodLvl() {
        return animalFood;
    }
}
