package animalKingdom;

abstract class Animal {
    // comeback and make make it work without static since using static on a protected object is bad practice
    protected static String move;
    protected static String breath;
    protected static String reproduce;

    // supertype constructor
    public Animal() {

    }

    public Animal(String move, String breath, String reproduce) {
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
    }

    // declaring getters at parent and will implement the methoed in the children classess
    abstract String getBreath();
    abstract String getMove();
    abstract String getReproduce();

}