package AnimalKingdom;

public class Fish extends Animals
{
 public Fish()
 {
     super();
 }   
 public Fish(String name, int yearDiscovered)
 {
     super();
     this.name= name;
     this.yearDiscovered= yearDiscovered;
 }

 public int getId()
 {
     return id;
 }
 public String getType()
 {
     return "Fish";
    }
    @Override
    public String breath()
    {
        return "gills";
    }
 @Override
 public String move()
 {
     return "swims";
 }

 @Override 
 public String reproduce()
 {
     return "Eggs";
 }

 @Override
 public String toString()
 {
      return " | " + name + " | " + yearDiscovered + " | \n";
 }
}