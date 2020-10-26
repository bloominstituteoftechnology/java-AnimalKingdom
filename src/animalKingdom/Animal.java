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

    // needs this abstract methoed to access methoed from Mammals at parent Animal
    abstract int getYear();
    abstract String getName();


}