package animalKingdom;

abstract class Animal {

    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    abstract String move();

    abstract String breathe();

    abstract String reproduce();

    public Animal(String name, int year) {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    int getYear() {
        return year;
    }

    @Override
    public String toString()
    {
        return "id=" + id + " " + "name=" + name + " " + "yearNamed=" + year;
    }
}
