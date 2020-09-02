package animals;

public class Birds extends Animals {
    //Birds move - fly, breath - lungs, reproduce - eggs

    //constructor
    public Birds (String name, int yearNamed) {
        super(name, yearNamed);
  
    }

    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breath(){
        return "lungs";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }


}