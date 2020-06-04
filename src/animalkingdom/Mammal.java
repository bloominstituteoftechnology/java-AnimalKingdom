package animalkingdom;

public class Mammal extends AbstractAnimal {
    public String name;

    public Mammal(String name, int year) {
        super(year);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String move() {
        useFood();
        return "walks";
    }

    @Override
    public String breathe() {
        return "breathes";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", year=" + year +
                '}';
    }
}