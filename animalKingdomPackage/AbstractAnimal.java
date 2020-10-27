package animalKingdomPackage;

import java.util.List;
import java.util.ArrayList;

abstract class AbstractAnimal {
    private static int maxId = 0;

    // protected, only parent & child know of field
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected List<String> stomach;

    public AbstractAnimal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.stomach = new ArrayList<>();
    }

    public List<String> eat(String food) {
        stomach.add(food);
        return stomach;
    }

    abstract String getMovementType();
    abstract String getBreathingType();
    abstract String getReproductionType();
}