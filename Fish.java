package AnimalKingdom;

public class Fish extends AbstractAnimals{
    private int year;
    private String name;
    
    public Fish(int year, String name){
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
    return "Eggs";
}
@Override 
public String breath(){
    return "Gills";
}

@Override 
public String move(){
    return "Swim";
}
@Override 
public String toString(){
    return "Fish: " + name + " Year: " + year;
}
}