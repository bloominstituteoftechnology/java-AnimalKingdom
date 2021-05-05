package animalKingdom;
//this is used to give helper fucntion a type
@FunctionalInterface
public interface AnimalChecker
{
  boolean test(Animals a);
}
