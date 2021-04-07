package animalKingdomApp;

public class Birds extends AnimalsAbstract{

    public Birds(String name, int yearNamed) {
        super("Bird", name, yearNamed);
    }

    @Override 
    public String move(){
        return "flying";
    }

    @Override 
    public String breath(){
        return "lungs";
    }

    @Override 
    public String reproduce(){
        return "eggs";
    }
    
    
    
}
