package animalkingdomapp;

public class Birds extends Animal {

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
	return "fly"
}

@Override
public String getBreathe(){
	return "lungs"
}
@Override
public String getReproduce(){
	return "eggs"
}
  @Override
  public String toString() {
    return "* Bird *  Name: " + name + " Year: " + year;
  }

}