package AnimalKingdom;

public class Fish extends Animals{
    public Fish( String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public void move(String moving){
        moving = "swimming";
        System.out.println(moving);
    }
    @Override
    public void breathe(String breathing){
        breathing = "gills";
        System.out.println(breathing);
    }
    @Override
    public void reproduce(String reproducing){
        reproducing = "eggs";
        System.out.println(reproducing);
    }

}