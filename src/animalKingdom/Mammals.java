package animalKingdom;

public class Mammals extends Animal {
    // move comes from parent class
    // breath comes from parent class
    // reproduce comes from parent class

    public static int maxYear = 0;
    public int id;
    public String name;
    public int year;

    // parent constructor that takes in object from parent class
    public Mammals(String name, int year, String move, String breath, String reproduce) {
        super(move, breath, reproduce);
        maxYear++;
        id = maxYear;
        this.name = name;
        this.year = year;
    }

    // child constuctor that just takes in object from this class
    public Mammals(String name, int year) {
        maxYear++;
        id = maxYear;
        this.name = name;
        this.year = year;
    }

    // getters
    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getYear() {

        return year;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /* Making mammals print readable */
    @Override
    public String toString() {
        return "id:" + " " + id + " " + "name:" + " " + name + " " + "yearNamed:" + " " + year;
    }

}