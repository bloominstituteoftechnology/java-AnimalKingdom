package AnimalKingdom;

public class Mammal extends Animal {
    String move = "walk";
    String breathe = "lungs";
    String reproduce = "live birth";

    public Mammal(String name, int year){
        ++ maxId;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }
}
