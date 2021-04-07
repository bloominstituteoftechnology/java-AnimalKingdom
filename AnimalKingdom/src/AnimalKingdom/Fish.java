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
    public void breathe(){
        String breathing = "gills";
        System.out.println(breathing);
    }
    @Override
    public void reproduce(){
        String reproducing = "eggs";
        System.out.println(reproducing);
    }

}