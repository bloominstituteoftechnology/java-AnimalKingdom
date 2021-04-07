package animals;

abstract class Animal{
    protected static int maxId = 1;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected String move;
    protected String breath;
    protected String reproduce;
    
    public Animal(String name, int yearNamed, String move, String breath, String reproduce ) {
        id = maxId;
        maxId++;
        this.name = name ;
        this.yearNamed = yearNamed;
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearNamed() {
        return yearNamed;
    }

    public String getMove() {
        return move;
    }
    public String getBreath() {
        return breath;
    }
    public String getReproduce() {
        return reproduce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public void setReproduce(String reproduce ){
        this.reproduce = reproduce;
    }

    public void eat(){
        System.out.println("Ohm nom nom!");
    }

    @Override
    public String toString()
    {
        return "Animals{id=" + this.id + ", name='" + this.name + "', yearNamed=" + this.yearNamed + "}";
    }

}
