package animalKingdom;

public class Fish extends Animal {

    public Fish(String name, int year) {
        super(name, year);
    }
    @Override
    public String reproduce() {
        return "eggs";
    }
    @Override
    public String breathe() {
        return "gills";
    }
    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String filteredString()
    {
        return name + " " + reproduce() + " " + move() + " " + breathe() + " " + year; 
    }
}
