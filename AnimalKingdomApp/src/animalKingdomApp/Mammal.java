package animalKingdomApp;

public class Mammal extends AnimalsAbstract {

    public Mammal(String name, int yearNamed) {
        super("Mammal", name, yearNamed);
    }
        
    @Override
    public String move(){
        return "walking";
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
