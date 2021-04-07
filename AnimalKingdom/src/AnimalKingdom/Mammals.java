package AnimalKingdom;

public class Mammals extends Animals{
    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public void move(){
        String moving = "walking";
        System.out.println(moving);
    }
    @Override
    public void breathe(){
        String breathing = "lungs";
        System.out.println(breathing);
    }
    @Override
    public void reproduce(){
        String reproducing = "live births";
        System.out.println(reproducing);
    }
    
}