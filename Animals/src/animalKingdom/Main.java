package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static List<Animal> filteredList = new ArrayList<>();
	public static void filterAnimal(List<Animal> animals, CheckAnimal tester)
	{
		filteredList.clear();
		for (Animal a : animals)
		{
			if (tester.test(a))
			{
				filteredList.add(a);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("*** MVP ***");

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals ("Koala", 1816);
		Mammals sloth = new Mammals ("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<Animal> myList = new ArrayList<>();
		myList.add(panda);
	
		myList.add(koala);

		myList.add(sloth);
		
		myList.add(raccoon);
	
		myList.add(armadillo);
	
		myList.add(toucan);
		
		myList.add(swan);

		myList.add(salmon);
		
		myList.add(parrot);

		myList.add(pigeon);

		myList.add(peacock);

		myList.add(zebra);

		myList.add(perch);

		myList.add(catfish);

		myList.add(bigfoot);
		
		
		System.out.println("*** List all the animals in descending order by year named ***");
		myList.sort((a1,a2) -> a2.getYear() - a1.getYear());
		
		System.out.println(myList);

		System.out.println();

		System.out.println("*** List all the animals alphabetically ***");
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

		System.out.println(myList);

		System.out.println();

		System.out.println("*** List all the animals order by how they move ***");
		myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		
		System.out.println(myList);

		System.out.println();

		System.out.println("*** List only those animals the breath with lungs ***");

		filterAnimal(myList, a -> (a.breathe()=="lungs"));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List only those animals that breathe with lungs and were named in 1758 ***");
		filterAnimal(myList, a -> (a.breathe()=="lungs")&&a.getYear()==1758);
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
		filterAnimal(myList, a -> (a.reproduce()=="eggs")&&a.breathe()=="lungs");
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
		filterAnimal(myList, a -> a.getYear()==1758);
		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));

		System.out.println();

		System.out.println("*** Stretch Goal ***");

		System.out.println();

		System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
		filterAnimal(myList, a -> ((a instanceof Mammals)));
		filteredList.forEach(a -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear()));
	}

}