package AnimalKingdom;

public class Birds extends Animals {
    public Birds(  String name, int yearNamed) {
        super(name, yearNamed);
    }
    @Override
    public String move(String moving){
        return "flying";
    }
    @Override
    public String breathe(String breathing){
        return "lungs";
    }
    @Override
    public String reproduce(String reproducing){
        return "eggs";
    }
}