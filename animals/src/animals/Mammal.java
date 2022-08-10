package animals;

public class Mammal extends AbstractAnimal
{
    public Mammal(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }
   @Override
   public String move()
   {
       return "walk";
   }
   @Override
   public String breath()
   {
       return "lungs";
   }
   @Override
   public String reproduce()
   {
       return "live birth";
   }
}