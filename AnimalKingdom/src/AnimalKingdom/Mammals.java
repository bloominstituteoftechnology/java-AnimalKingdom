package AnimalKingdom;

public class Mammals extends Animals{
    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move(String moving) {
    return "walking";
    }
    
    @Override
    public String breathe(String breathing) {
        return "lungs";
    }

    @Override
    public String reproduce(String reproducing) {
        return "live births";
    }
    
    @Override
    public String type(String type) {
        return "mammals";
    }
    
}