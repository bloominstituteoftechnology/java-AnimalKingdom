package animalKingdom;

abstract class AbstractAnimal {

    private static int maxId;
    
    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    //get
    public int getId() { return id; }
    public String getName() { return name; }
    public int getYear() { return year; }

    //set
    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }

    String eat() { return "nom nom nom nom!"; }
    
    @Override 
    public String toString() { return "Animals{id=" + id + ", name=" + name + ", year discovered =" + year + "}"; }
    abstract String move();
    abstract String breath();
    abstract String reproduce();
}