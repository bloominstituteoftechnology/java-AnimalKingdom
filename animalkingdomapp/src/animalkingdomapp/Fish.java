package animalkingdomapp;

public class Fish extends Animal {

public Birds (String name, int year){
	super(name, year)
}

@Override
public int getYear(){
	return year;
}

public void setYear(int year){
	this.year= year;

}

@Override
public String getName(){
	return name;

}

public void setName(String name){
	this.name = name;
}

@Override
public String getMove(){
	return "swim"
}

@Override
public String getBreathe(){
	return "gills"
}
@Override
public String getReproduce(){
	return "eggs"
}
  @Override
  public String toString() {
    return "* Fish *  Name: " + name + " Year: " + year;
  }

}