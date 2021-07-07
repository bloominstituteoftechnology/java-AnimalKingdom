package animalkingdom;

public class Bird extends Animal {
    public Bird(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String move() {
        return "Flies";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}