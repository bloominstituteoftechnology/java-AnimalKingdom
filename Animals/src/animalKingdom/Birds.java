package animalKingdom;

public class Birds extends Animal
{

	public Birds(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breathe()
	{
		return "lungs";
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
		return "Bird:" + name + " " + reproduce() + " " + breathe() + "', year was named" + year + "\n";
	}

}