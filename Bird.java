package AnimalKingdom;

public class Bird extends Animal {
    String move = "fly";
    String breathe = "lungs";
    String reproduce = "eggs";

    public Bird(String name, int year){
        ++ maxId;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }
}