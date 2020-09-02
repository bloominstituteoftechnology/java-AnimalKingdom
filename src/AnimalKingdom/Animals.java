package AnimalKingdom;


abstract class Animals {
    //fields
private static int maxId= 0;
protected int id;
protected int yearDiscovered;
protected String name;

//constructor 
public Animals(int yearDiscovered, String name)
{
    maxId++;
    this.id= maxId;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
}
    
    
public Animals(){
    maxId++;
    id= maxId;
}

//all animals can eat 

String eat()
{
    return "EAT";
}

//get

public int getYearDiscovered()
{
    return yearDiscovered;
}

public String getName()
{
    return name;
}
public String getBreath()
{
 return breath();
}
abstract String move();
abstract String breath();
abstract String reproduce();
}