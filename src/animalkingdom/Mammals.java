package animalkingdom;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return ("walks");
    }
  
    @Override
    public String breath() {
      return ("breathes with its lungs");
    }
  
    @Override
    public String reproduce() {
      return ("births its child(ren)");
    }
  }