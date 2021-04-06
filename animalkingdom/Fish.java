package animals


public class Fish extends Animals{

	public Fish (String name, int year){
		super(name,year)
	}

@Override
public int getYear(){
	return year;
}
public void setYear(){
	this.year = year;
}
@Override
public String getName(){
	return name;
}
public void setName(){
	this.name = name;
}

@Override
public String getMove(){
	return "swim";
}
@Override
public String getBreath(){
	return "gills"
}
@Override
public String getReproduce(){

	return "eggs"
}

@Override

public String toString(){
	return "Fish Name:"+ name + "Year:" + year;
}
}