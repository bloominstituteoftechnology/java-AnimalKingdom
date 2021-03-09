package animals;

abstract class Animals
{
    private int id;
    private String name;
    private int year;

    public Animals(int id, String name, int year)
    {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String eat();

    public String move();

    public String breath();

    public String reproduce();

}
