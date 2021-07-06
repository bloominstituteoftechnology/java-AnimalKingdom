package animalKingdom;

abstract class Animal
{
	private static int maxId = -1;
	protected int id;
	int year;
	String name;

	//constructor
	public Animal(String name, int year)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.year = year;
	}

	abstract String move();
	abstract String breathe();
	abstract String reproduce();

	public int getId()
	{
		return id;
	}

	String getName()
	{
		return name;
	}

	int getYear()
	{
		return year;
	}

	String food()
	{
		return "Gulp";
	}
}