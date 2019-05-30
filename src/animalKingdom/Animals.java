package animalKingdom;

public abstract class Animals
{
	
	protected int id;
	protected String name;
	protected int year;

	public Animals(int id, String name,int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();

	public String eat()
	{
		return "Animal is eating food";
	}

	//name getter and setter 
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//year getter and setter
	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	@Override
	public String toString()
	{
		return "Name: " + name + 
				"\tId: " + id + 
				"\tYear: " + year;
	}
}