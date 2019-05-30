package animalKingdom;

public class Birds extends Animals
{
	public Birds(int id, String name, int year)
	{
		super(id, name, year);
		this.id = id;
		this.name = name;
		this.year = year;
	}

	@Override
	public String move()
	{
		return "Fly";
	}

	@Override
	public String breath()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}

}