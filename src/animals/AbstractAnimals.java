package animals;

public abstract class AbstractAnimals {
    String name;
    int year;

    public AbstractAnimals(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    public abstract String getName();
    public abstract int getYear();

    public String toString() {
        return "Name: " + name + "Year Name: " + year;
    }
}
