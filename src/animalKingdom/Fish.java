package animalKingdom;

public class Fish extends AbstractAnimal {

    public Fish(String name, int year) { super(name, year); }

    @Override String move() { return "swim"; }
    @Override String breath() { return "gills"; }
    @Override String reproduce() { return "eggs"; }    
    
}