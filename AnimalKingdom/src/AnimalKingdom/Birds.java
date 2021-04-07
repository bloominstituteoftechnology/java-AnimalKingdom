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
    public void breathe(){
        String breathing = "lungs";
        System.out.println(breathing);
    }
    @Override
    public void reproduce(){
        String reproducing = "eggs";
        System.out.println(reproducing);
    }

}