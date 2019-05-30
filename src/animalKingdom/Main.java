package animalKingdom;

import java.util.*;

public class Main 
{

	public static void printAnimals(ArrayList<Animals> animals, CheckAnimal tester)
	{
		for(Animals a : animals)
		{
			if(tester.test(a))
			{
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Animals> myList = new ArrayList<Animals>();

		Mammals m1 = new Mammals(1, "Panda",1869);
		Mammals m2 = new Mammals(2, "Zebra",1778);
		Mammals m3 = new Mammals(3, "Koala",1816);
		Mammals m4 = new Mammals(4, "Sloth",1804);
		Mammals m5 = new Mammals(5, "Armadillo",1758);
		Mammals m6 = new Mammals(6, "Raccoon",1758);
		Mammals m7 = new Mammals(7, "Bigfoot",2021);

		myList.add(m1);
		myList.add(m2);
		myList.add(m3);
		myList.add(m4);
		myList.add(m5);
		myList.add(m6);
		myList.add(m7);

		Birds b1 = new Birds(1, "Pigeon", 1837);
		Birds b2 = new Birds(2, "Peacock", 1821);
		Birds b3 = new Birds(3, "Toucan", 1758);
		Birds b4 = new Birds(4, "Parrot", 1824);
		Birds b5 = new Birds(5, "Swan", 1758);

		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		myList.add(b4);
		myList.add(b5);

		Fish f1 = new Fish( 1, "Salmon",1758 );
		Fish f2 = new Fish( 2, "Catfish", 1817);
		Fish f3 = new Fish( 3, "Perch", 1758);

		myList.add(f1);
		myList.add(f2);
		myList.add(f3);

		// for(Animals a: myList)
		// 	System.out.println(a);


		System.out.println("\t*** Descending by Year***");
		myList.sort((a1, a2) -> a1.getYear() - a2.getYear());
		for(Animals a: myList)
			System.out.println(a);

		System.out.println("\n\n\t*** Alphabetically***");
		myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		for(Animals a: myList)
			System.out.println(a);
		
	}
}