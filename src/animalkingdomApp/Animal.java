package animalkingdomApp;

public abstract class Animal {
	static int maxId = 0;
	int id;
	String name;
	int year;

	public Animal(String name, int year){
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String eat() {
        return name + " eats.";
    }

    @Override
    public String toString() {
        return "id=" + id + ", Name= " + name + ", YearNamed= " + year;
    }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

}