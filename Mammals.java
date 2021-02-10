package AnimalKingdom;

public class Mammals extends AbstractAnimals{
    private int year;
    private String name;

    public Mammals(int year, String name){
        this.year = year;
        this.name = name;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
@Override
public String reproduce(){
    return "Live";
}
@Override 
public String breath(){
    return "Lungs";
}

@Override 
public String move(){
    return "Walk";
}
@Override 
public String toString(){
    return "Mammals: " + name + " Year: " + year;
}
}