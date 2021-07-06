package animalKingdom;

public class Fish extends Animal
{

	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "swims";
	}

	@Override
	public String breathe()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
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
		return "Fish:"+ name + " " + reproduce() + " " + breathe() + " "+ "year was named" + year + "\n";
	}

}