package animalkingdomApp;

public class Mammal extends Animal {

	public Mammal(String name, int year) {
		super(name, year);
	}
	@Override
	public String move(){
		return "walk";
	}
	@Override
	public String breath(){
		return "lungs";
	}
	@Override
	public String reproduce(){
		return "live births";
	}
}