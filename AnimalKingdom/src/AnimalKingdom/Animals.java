package AnimalKingdom;

public abstract class Animals{
    private static int maxId = 1;
    private int id;
    private String name;
    private int yearNamed

    public Animals(String name, int yearNamed){
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
        return year;
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

    public void move(String moving){
        System.out.println(moving);
    }

    public void breathe(String breathing){
        System.out.println(breathing);
    }
    public void reproduce(String reproducing){
        System.out.println(reproducing);
    }
}