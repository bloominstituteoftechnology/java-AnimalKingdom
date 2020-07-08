package animalKingdom;

public class Mammal extends AbstractAnimal {

    public Mammal(String name, int year) { super(name, year); }

    @Override String move() { return "walk"; }
    @Override String breath() { return "lungs"; }
    @Override String reproduce() { return "live birth"; }
    
}