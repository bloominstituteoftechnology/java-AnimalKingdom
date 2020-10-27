package animalKingdomPackage;

public class Mammal extends AbstractAnimal{
    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovementType(){
        return "walk";
    }
    @Override
    public String getBreathingType(){
        return "lungs";
    }
    @Override
    public String getReproductionType(){
        return "live birth";
    }

    @Override
    public String toString() {
        return "\n id: " + id + "\n name: " + name + "\n year discovered: " + yearDiscovered + "\n type of movement: " + getMovementType() +
                "\n type of breathing: " + getBreathingType() + "\n type of reproduction: " + getReproductionType();

    }
}