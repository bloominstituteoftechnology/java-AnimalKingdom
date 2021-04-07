package AnimalKingdom;

public abstract class Animals{
    public static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearNamed;

    public Animals(String name, int yearNamed) {
        id = maxId;
        maxId++;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getYearNamed(){
        return yearNamed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public abstract  String move(String moving);

    public abstract String breathe(String breathing);

    public abstract String reproduce(String reproducing);

    @Override
    public String toString() {
        return ("Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "},\n");
    }
}