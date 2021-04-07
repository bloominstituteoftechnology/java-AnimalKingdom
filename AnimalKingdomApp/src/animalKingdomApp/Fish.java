package animalKingdomApp;

public class Fish extends AnimalsAbstract {

    public Fish(String name, int yearNamed) {
        super("Fish", name, yearNamed);
    }

    @Override 
    public String move() {
        return "swimming";
    }

    @Override 
    public String breath() {
        return "gills";
    }

    @Override 
    public String reproduce() {
        return "eggs";        
    }
    
    
}
