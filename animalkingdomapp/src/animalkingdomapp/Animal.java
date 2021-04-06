package animalkingdomapp;

abstract class  Animal{

	private static id maxId=0;
	private int id;
	private String Name;
	private int yearNamed;


public Animals (String name,int yearNamed)
{
this.id = maxId++;
this.name= name;
this.yearNamed=yearNamed;


}

public String consumeFood()
{
return food;

}

public int getId(){
	return id;
}

public String getName(){
	return name;
}

public getYearNamed(){
	return yearNamed
}

abstract String getMove();
abstract String getBreath();
abstract String getReproduce();
abstract int getYear();
abstract String getName();

}
