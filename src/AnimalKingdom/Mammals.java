package AnimalKingdom;

public class Mammals extends Animals
{
    public Mammals()
    {
        super();
    }

    public Mammals(String name, int yearDiscovered){
        super();
        this.name= name;
        this.yearDiscovered = yearDiscovered;
    }
    //get
    public String getName()
    {
        return name;
    }

    public int getId(){
        return id;
    }

    public String getTyoe()
    {
        return "Mammal";
    }

    //method
    @Override
    public String move()
    {
        return "Walks";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }
    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString()
    {
        return " | " + name + " | " + yearDiscovered + " | \n";
    }
}