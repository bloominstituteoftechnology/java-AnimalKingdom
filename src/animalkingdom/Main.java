package animalkingdom;

import java.util.ArrayList;

public class Main {
    public static void filterAnimals(ArrayList<AbstractAnimal> animals, Filter tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName() + " " + a.getYear());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<AbstractAnimal> myList = new ArrayList<>();

        myList.add(new Mammal("Panda", 1869));
        myList.add(new Mammal("Zebra",1778));
        myList.add(new Mammal("Koala",1816));
        myList.add(new Mammal("Sloth",1804));
        myList.add(new Mammal("Armadillo",1758));
        myList.add(new Mammal("Raccoon",1758));
        myList.add(new Mammal("Bigfoot",2021));

        myList.add(new Bird("Pigeon",1837));
        myList.add(new Bird("Peacock",1821));
        myList.add(new Bird("Toucan",1758));
        myList.add(new Bird("Parrot",1824));
        myList.add(new Bird("Swan",1758));

        myList.add(new Fish("Salmon",1758));
        myList.add(new Fish("Catfish",1817));
        myList.add(new Fish("Perch",1758));

        System.out.println();
        System.out.println("\t\t --- The List ---");
        System.out.println(myList.toString());
        System.out.println();

        System.out.println("\t\t --- The List in decending order by year ---");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println();

        System.out.println("\t\t --- The List sorted alphabetically ---");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println();

        System.out.println("\t\t --- The List sorted by movement type ---");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.move()));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs---");
        System.out.println();
        filterAnimals(myList, a -> a.breathe().equalsIgnoreCase("lungs"));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs" +
                " and were named in 1758---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                && (a.getYear() == 1758)));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs " +
                "and who lay eggs---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                && (a.reproduce().equalsIgnoreCase("eggs"))));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs " +
                "or who lay eggs---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                || (a.reproduce().equalsIgnoreCase("eggs"))));
        System.out.println();

        System.out.println("\t\t --- The List sorted alphabetically and by animals " +
                "which were named in 1758---");
        System.out.println();
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filterAnimals(myList, a -> (a.getYear() == 1758));
        System.out.println();
    }
}