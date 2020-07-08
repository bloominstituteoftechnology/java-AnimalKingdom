package animalKingdom;

public class Bird extends AbstractAnimal {

	public Bird(String name, int year) { super(name, year); }

    @Override String move() { return "fly"; }
	@Override String breath() { return "lungs"; }
	@Override String reproduce() { return "eggs"; }
    
}