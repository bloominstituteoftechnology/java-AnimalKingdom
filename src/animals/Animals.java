package animals;

public abstract class Animals{
    //fields that all animals will have
    private static int maxId=0;
    protected int id;
    protected String name;
    protected int yearNamed;

    //default constructor 
    public Animals(String name, int yearNamed){
        this.id = maxId ++;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    //regular methods are the same for each animal
    //how the animal consumes food
    public String eat(){
        return "food";
    }

    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getYearNamed(){
        return yearNamed;
    }

    //abstract methods that will vary by animal( MUST be used)
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

     @Override
    public String toString(){
        return "Animals{" +
        "id:" + id +
        ", Name: " + name +
        ", Year: " + yearNamed +
        '}' + '\n';
    }

}