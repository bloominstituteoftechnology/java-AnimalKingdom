package AnimalKingdom;

public class Fish extends Animals{
    public Fish( String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String move(String moving) {
        return "swimming";
    }  
    @Override
    public String breathe(String breathing) {
        return "gills";
    }

    @Override
    public String reproduce(String reproducing) {
        return "eggs";
    }
    
    @Override
    public String type(String type) {
        return "fish";
    }

}