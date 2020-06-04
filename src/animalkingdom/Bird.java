package animalkingdom;

public class Bird extends AbstractAnimal {
    public String name;

    public Bird(String name, int year) {
        super(year);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String move() {
        useFood();
        return "fly";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", year=" + year +
                '}';
    }
}