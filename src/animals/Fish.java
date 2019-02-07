package animals;

public class Fish extends AbstractAnimals {
    public Fish(String name, int year) {
        super(name);
        super(year);
    }

    @Override
    public void move() {
        return "Swim";
    }

    @Override
    public String breath() {
        return "Lungs take in air";
    }

    @Override
    public String reproduce() {
        return "Fish lays eggs";
    }
}
