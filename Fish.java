package AnimalKingdom;

public class Fish extends Animal {
    String move = "swim";
    String breathe = "lungs";
    String reproduce = "eggs";

    public Fish(String name, int year){
        ++ maxId;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }
}