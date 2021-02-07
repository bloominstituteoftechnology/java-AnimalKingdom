package animalKingdom;

public class Mammals extends Animal {
    // there are no extra fields needed

    public Mammals(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
    @Override
    public String move()
    {
        return "lungs";
    }
    @Override
    public String breathe()
    {
        return "walk";
    }
}
