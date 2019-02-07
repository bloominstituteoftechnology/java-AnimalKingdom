package animals;

public class Birds extends AbstractAnimals{
    public Birds(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return this.name + "flies toward his destination";
    }

    @Override
    public String breath() {
        return this.name + "uses lungs to breathe";
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
