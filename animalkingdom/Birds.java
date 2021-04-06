package animals;

public class Birds extends Animals{

	public Birds (string name, int year){
		super (name,year)
	}
 @Override
 public int GetYear(){
 	return year;
 }

 public void setYear(){
 	this.year= year;
 }

 @Override
 public string getName(){
 	return name;
 }
 public void setName(){
 	this.name = name;
 }

 @Override
 public string getReproduce(){
 	return "egg";
 }

 @Override
 public String getMove(){
 	return "fly"
 }

 @Override
 public String getBreath(){
 	return "lungs"

 }
 @Override

 public String toString(){
 	return "Bird Name:" + name + "year:" + year;
 }
}