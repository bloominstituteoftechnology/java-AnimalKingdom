package animalKingdomPackage;

public class Bird extends AbstractAnimal{
    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovementType(){
        return "fly";
    }
    @Override
    public String getBreathingType(){
        return "lungs";
    }
    @Override
    public String getReproductionType(){
        return "eggs";
    }

    @Override
    public String toString() {
        return "\n id: " + id + "\n name: " + name + "\n year discovered: " + yearDiscovered + "\n type of movement: " + getMovementType() +
                "\n type of breathing: " + getBreathingType() + "\n type of reproduction: " + getReproductionType();

    }
}