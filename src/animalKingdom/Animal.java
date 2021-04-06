package animalKingdom;

abstract class Animal {
  //all animals have energy
  protected int maxId;
  protected int id;
  protected int energy;
  protected String name;
  protected int year;
  
  public Animal(String name, int year) {
    maxId++;
    energy = 1;
    id = maxId;
    this.name = name;
    this.year = year;
    
  }

  //energy is increased 1 for each amt of food consumed
  public void consumeFood(int amount) {
    energy += amount;
    System.out.println(name + " consumed " + amount + " food. Energy is now " + energy);
  }

  //all animals movee, breathe, reproduce
  //string returns how they do that
  abstract String getMove();
  abstract String getBreathe();
  abstract String getReproduce();
  abstract int getYear();
  abstract String getName();

}