package animals;

import java.util.List;
import java.util.ArrayList;

public class Main 
{
	

	public static List<Animal> displayAnimal(List<Animal> animalList, Animaltest tester)
	{	
		//Local Variable
		List <Animal> myAnimalList = new ArrayList<>();
		
		//for each abstract animal(animal) that is in animalList to do something
		for(Animal animal : animalList)
		{
			if(tester.test(animal))
			{
				myAnimalList.add(animal);
			}
		}

		return tempList;


	}


	public static void main (String[] args)
	{
		System.out.println("Welcome to the Animal Kingdom");
	}
}