package AnimalKingdom;

abstract class AbstractAnimals{

    protected int maxId = 0;
    protected int id = maxId++;
    
    abstract String reproduce();
    abstract String breath();
    abstract String move();
    abstract int getYear();
    abstract String getName();
    

    public AbstractAnimals(){
       
    }
   
 







}