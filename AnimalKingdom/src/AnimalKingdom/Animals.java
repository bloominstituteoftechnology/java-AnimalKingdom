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

    public void move(){
        String moving = "moving";
        System.out.println(moving);
    }

    public void breathe(){
        String breathing = "breathing";
        System.out.println(breathing);
    }

    public void reproduce() {
        String reproducing = "eggs";
        System.out.println(reproducing);
    }
    @Override
    public String toString() {
        return ("Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearNamed + "},\n");
    }
}