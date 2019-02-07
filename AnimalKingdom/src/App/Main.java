package App;

import java.util.*;


public class Main
{
    public static void testAnimals(List<Animals> animals, Test tester)
    {
        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName());
            }
        }
    }

    public static List<Animals> filterAnimals(List<Animals> animals, Test tester)
    {
        List<Animals> filtered = new ArrayList<>();
        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                filtered.add(a);
            }
        }
        return filtered;
    }

    public static void main(String[] args)
    {
        ArrayList<Animals> animals = new ArrayList<Animals>();

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoom = new Mammals("Raccoom", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);


        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoom);
        animals.add(bigfoot);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("** Sorting in reverse order by year **");
        System.out.println("name | year");
        animals.sort(Comparator.comparing(Animals::getYear).reversed());
        animals.forEach(animal -> System.out.println(animal.getName() + " | " + animal.getYear()));
        System.out.println("******************");
        System.out.println("Sorting alphabetically");en
        animals.sort(Comparator.comparing(Animals::getName));
        animals.forEach(a -> System.out.println(a.getName()));
        System.out.println("******************");
        System.out.println("Sorting by their movement type.");
        System.out.println("name | movement type");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(a -> System.out.println(a.getName() + " | " + a.move()));
        System.out.println("*******************");
        System.out.println("filter by lungs.");
        testAnimals(animals, (a -> a.breath().contains("lungs")));
        System.out.println("******************");
        System.out.println("Sorting by breath method and year 1758");
        testAnimals(animals, a -> (a.breath().contains("lungs")) && (a.getYear() == 1758));
        System.out.println("******************");
        System.out.println("Sorting by egg reproduction and breath method of lungs");
        testAnimals(animals, a -> (a.breath().contains("lungs")) && (a.reproduce().contains("eggs")));
        System.out.println("******************");
        System.out.println("filter by year discovered, and sort alphabetically");
        List<Animals> filtered = filterAnimals(animals, a -> a.getYear() == 1758);
        filtered.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filtered.forEach(a -> System.out.println(a.getName()));
    }
}
