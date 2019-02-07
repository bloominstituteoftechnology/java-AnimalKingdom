package animals;

public class Mammals extends AbstractAnimals{

    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "walks";
    }

    @Override
    public String breath() {
        return  "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
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
