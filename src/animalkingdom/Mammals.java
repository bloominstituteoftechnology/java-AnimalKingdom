package animalkingdom;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
      return "walks";
    }
  
    @Override
    public String breathe() {
      return "lungs";
    }
  
    @Override
    public String reproduce() {
      return "live births";
    }
  }