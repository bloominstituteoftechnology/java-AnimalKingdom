package animalKingdom;

public class Mammal extends Animal {
    // there are no extra fields needed

    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String move() {
        return "lungs";
    }

    @Override
    public String breathe() {
        return "walk";
    }

    @Override
    public String filteredString()
    {
        return name + " " + reproduce() + " " + move() + " " + breathe() + " " + year; 
    }
}
