package animals;

public abstract class Animal
{
  private static int maxId = 0;
  private int id;
  private String name;
  private int year;

  public Animal(String name, int year)
  {
    this.id = maxId++;
    this.name = name;
    this.year = year;
  }

  public String eat()
  {
    return "food";
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

  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();

  @Override
  public String toString()
  {
    return "Animals{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", year=" + year +
      '}' + '\n';
  }
}
