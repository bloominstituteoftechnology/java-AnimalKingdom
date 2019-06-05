package animals;

public class Mammals extends AbstractAnimal
{
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