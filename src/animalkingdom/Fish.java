package animalkingdom;

public class Fish extends AbstractAnimal {
    public String name;

    public Fish(String name, int year) {
        super(year);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String move() {
        useFood();
        return "swims";
    }

    @Override
    public String breathe() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", year=" + year +
                '}';
    }
}