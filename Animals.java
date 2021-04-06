package animals;

abstract class Animals {

private static id maxid = 0
private int id;

private String name;

private int yearNamed;

public Animals (String name,int year){
	this.id = maxid++;
	this.name = name;
	this. yearNamed = yearNamed;
}
public String ConsumeFood(){
	return food;
}

public int getId(){
	return id;
}

public int getYear(){
	return year;
}

abstract String getYear();

abstract String getBreath();

abstract String getName();

abstract int getYear();

abstract String getReproduce();








}