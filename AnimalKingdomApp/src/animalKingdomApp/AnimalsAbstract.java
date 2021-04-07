package animalKingdomApp;

abstract class AnimalsAbstract {
    
    protected static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected String classification;
        
    public AnimalsAbstract(String classification, String name, int yearNamed){
        id = maxId;
        maxId++;
        this.classification = classification;
        this.name = name;
        this.yearNamed = yearNamed;
    }
    
    public int getId(){
        return id;
    }
    
    public String getClassification(){
        return classification;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYearNamed(){
        return yearNamed;
    }

    public void setYearNamed(int yearNamed){
        this.yearNamed = yearNamed;
    }

    public void consumeFood() {
        System.out.println("Chews Loudly!!!");     
    }
    
    abstract String move();
    
    abstract String breath();

    abstract String reproduce();

    @Override 
    public String toString() {
        return "Animal{id=" + id + "," + "name=" + name + "," + "yearNamed=" + yearNamed + "}" +"\n";
    }

}
