package animals;

public class Fish extends AbstractAnimals {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return this.name + "swims toward his destination";
    }

    @Override
    public String breath() {
        return this.name + "uses gills to breathe";
    }

    @Override
    public String reproduce() {
        return this.name + "lays eggs";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getYear() {
        return this.year;
    }
}
