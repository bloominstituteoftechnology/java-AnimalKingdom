package animals;

public class Birds extends AbstractAnimals{
    public Birds(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
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
