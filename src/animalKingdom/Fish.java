package animalKingdom;

public class Fish extends Animal {

    public static int maxYear = 0;
    public int id;
    public String name;
    public int year;

    // parent classs constructor
    public Fish(String name, int year, String move, String breath, String reproduce) {
        super(move, breath, reproduce);
        maxYear++;
        id = maxYear;
        this.name = name;
        this.year = year;
    }

    // child class constructor
    public Fish(String name, int year) {
        // object from parents class is being used by parent constructor in this class
        maxYear++;
        id = maxYear;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "id:" + " " + id + " " + "name:" + " " + name + " " + "yearNamed:" + " " + year;
    }

}

