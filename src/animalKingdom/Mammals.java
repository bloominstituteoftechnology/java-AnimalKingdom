package animalKingdom;

public class Mammals extends Animals
{
	public Mammals(int id, String name, int year)
	{
		super(id, name, year);
		this.id = id;
		this.name = name;
		this.year = year;
	}

	@Override
	public String move()
	{
		return "Walk";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Live Births";
	}

}