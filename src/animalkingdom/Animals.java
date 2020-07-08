package animalkingdom;

abstract class Animals {

    private static int idCount = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public Animals(String name, int yearDiscovered) 
    {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.id = idCount++;
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

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    @Override
    public String toString()
    {
        return "Animals{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", yearDiscovered=" + yearDiscovered +
            '}' + '\n';
    }
}