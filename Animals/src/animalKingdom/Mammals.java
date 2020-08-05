package animalKingdom;

public class Mammals extends Animal
{

	public Mammals(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breathe()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}

	@Override
	public String toString()
	{
		return "Mammals:"+ name + " " + reproduce() + " " + breathe() + " "+ "year was named" + year + "\n";
	}

}