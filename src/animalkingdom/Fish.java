package animalkingdom;


public class Fish extends AbstractAnimal {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return ("swims");
    }

    
  @Override
  public String breath() {
    return ("breathes with its gills");
  }

  @Override
  public String reproduce() {
    return("produces eggs");
  }
}