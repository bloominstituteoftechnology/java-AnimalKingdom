package animals;

// create an abstract Animal class
	abstract class Animal 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int year;

	public Animal(String name, int year)
	{
		id = maxId++;
		this.name = name;
		this.year = year;
	}

	public String eat()
	{
		return "Food";
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}

	abstract String move();
	abstract String breathe();
	abstract String reproduce();

	@Override
	public String toString()
	{
		return "Animals: " + "id: " + id + "name: " + name + "year: " + year;
	}
}