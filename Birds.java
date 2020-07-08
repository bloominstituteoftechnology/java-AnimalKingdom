package AnimalKingdom;

public class Birds extends AbstractAnimals{
    private int year;
    private String name;

    public Birds(int year, String name){
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
    return "Lungs";
}

@Override 
public String move(){
    return "Fly";
}
@Override 
public String toString(){
    return "Birds: " + name + " Year: " + year;
}
}