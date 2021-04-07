package AnimalKingdom;

public class Mammals extends Animals{
    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public void move(String moving){
        moving = "walking";
    System.out.println(moving);
    }
    @Override
    public void breathe(String breathing){
        breathing = "lungs";
    System.out.println(breathing);
    }
    @Override
    public void reproduce(String reproducing){
        reproducing = "live births";
        System.out.println(reproducing);
    }
    
}