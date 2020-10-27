package animalKingdom;

abstract class Animal {
    // comeback and make make it work without static since using static on a protected object is bad practice
    protected String move;
    protected String breath;
    protected String reproduce;

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


// setting and getting how the animal will move
   void setMove(String move) {
       this.move = move;
   }

    String getMove() {
        return move;
    }


}