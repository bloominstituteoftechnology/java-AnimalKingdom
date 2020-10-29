package animalApp;

public abstract class Animals
{

  private static int maxId = 0;
  private int id;
  private String name;
  private int year;

  public Animals(String name, int year)
  {
    this.id = maxId++;
    this.name = name;
    this.year = year;
  }

  public String consume()
  {
    return "Food";
  }

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getYear()
  {
    return year;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public abstract String move();

  public abstract String breath();

  public abstract String reproduce();

  @Override
  public String toString()
  {
    return "Animals{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}' + '\n';

    }
}

}
