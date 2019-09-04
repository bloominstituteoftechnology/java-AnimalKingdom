package animalkingdom;

public class Mammals extends AbstractAnimal {
    public Mammals(Strig name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return does("walks");
    }
  
    @Override
    public String breath() {
      return does("breathes with its lungs");
    }
  
    @Override
    public String reproduce() {
      return does("births its child(ren)");
    }
  }