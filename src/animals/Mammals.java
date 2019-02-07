package animals;

public class Mammals extends AbstractAnimals{

    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return this.name + "walks toward his destination";
    }

    @Override
    public String breath() {
        return  this.name + "uses lungs to breathe";
    }

    @Override
    public String reproduce() {
        return this.name + "gives birth";
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
