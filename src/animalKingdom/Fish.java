package animalKingdom;

public class Fish extends Animals
{
	public Fish(int id, String name, int year)
	{
		super(id, name, year);
		this.id = id;
		this.name = name;
		this.year = year;
	}

	@Override
	public String move()
	{
		return "Swim";
	}

	@Override
	public String breath()
	{
		return "Gills";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}

}