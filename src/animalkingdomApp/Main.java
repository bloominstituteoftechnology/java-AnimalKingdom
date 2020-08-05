package animalkingdomApp;

import java.util.*;

public class Main {
	public static ArrayList<Animal> filteredList = new ArrayList<Animal>();

	public static void filter(ArrayList<Animal> list, TestAnimal tester) {
		filteredList.clear();
		for (Animal a : list) {
			if (tester.test(a)) {
				filteredList.add(a);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Mammal("Panda", 1869));
		animalList.add(new Mammal("Zebra", 1778));
		animalList.add(new Mammal("Koala", 1816));
		animalList.add(new Mammal("Sloth", 1804));
		animalList.add(new Mammal("Armadillo", 1758));
		animalList.add(new Mammal("Raccoon", 1758));
		animalList.add(new Mammal("Bigfoot", 2021));

		animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));

        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));
	
		System.out.println("\n***List all the animals in descending order by year named***\n");
		animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animalList.forEach(animal -> System.out.println(animal));

		System.out.println("\n*** List all the animals alphabetically ***\n");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(animal -> System.out.println(animal));

		System.out.println("\n*** List all the animals order by how they move ***\n");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(animal -> System.out.println(animal));

		System.out.println("\n*** List only those animals the breath with lungs ***\n");
		filter(animalList, animal -> animal.breath().equalsIgnoreCase("lungs"));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breath() + " " + animal.year));

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***\n");
        filter(animalList, animal -> animal.breath().equalsIgnoreCase("lungs") && animal.getYear() == 1758);
        filteredList.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breath() + " " + animal.year));

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***\n");
        filter(animalList, animal -> animal.breath().equalsIgnoreCase("lungs") && animal.reproduce().equalsIgnoreCase("eggs"));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breath() + " " + animal.year));

		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***\n");
		filter(animalList, animal -> animal.getYear() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breath() + " " + animal.year));
	}
}