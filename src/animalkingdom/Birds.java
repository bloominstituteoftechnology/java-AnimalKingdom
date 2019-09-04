package animalkingdom;

public class Birds extends AbstractAnimal {
    public Birds(String name, int year) {
        super(name, year);
    }
    
    @Override
    public String move() {
        return ("flies");
  }

  @Override
  public String breath() {
    return ("breathes with its lungs");
  }

  @Override
  public String reproduce() {
    return ("produces eggs");
  }
}