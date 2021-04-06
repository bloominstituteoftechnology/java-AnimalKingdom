package AnimalKingdom;

public class Fish extends Animals{
    public Fish(String name, String yearName) {
        super(name, yearName);
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getYearName(){
        return yearName;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setYearName(Int yearName){
        this.yearName = yearName;
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
    @Override
    public String toString() {
        return (name="+ name +", yearNamed="+yearNamed);
    }
}