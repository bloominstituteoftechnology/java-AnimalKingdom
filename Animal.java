package AnimalKingdom;

public abstract class Animal {
    public static int maxId = 0;
    int id;
    String name;
    int year;
    String move;
    String breathe;
    String reproduce;

    public String move(){return move;}
    public String breathe(){return breathe;}
    public String reproduce(){return reproduce;}

    public String eat(){ return "OMNOMNOM"; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


}
