package animalKingdom;

public class Mammals extends Animal {
    // move comes from parent class
    // breath comes from parent class
    // reproduce comes from parent class

    private int maxYear = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public Mammals(String name, int yearDiscovered) {
        super(move, breath, reproduce);
        maxYear++;
        id = maxYear;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }


    // adding to methoed from parent class
    @Override
    public String getBreath() {
        return breath;
    }

    @Override
    public String getMove() {
        return move;
    }

    @Override
    public String getReproduce() {
        return reproduce;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    /* Making mammals print readable */
    @Override
    public String toString() {
        return "id:" + " " + id + " " + "name:" + " " + name + " " + "yearNamed:" + " " + yearDiscovered;
    }

}