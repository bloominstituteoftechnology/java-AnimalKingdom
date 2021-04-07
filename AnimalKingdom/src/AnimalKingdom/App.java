package AnimalKingdom;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<Animals>();
        List<Animals> animals2 = new ArrayList<Animals>();
        List<Animals> animals3 = new ArrayList<Animals>();

        //Instantiate Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("BigFoot", 2021);
        // Instantiate Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);
        // Instantiate Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        // Add objects to "animals" List
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        //*** List all the animals in descending order by year named ***
        Comparator<Animals> reverseOrderbyYear = (Animals o1, Animals o2) -> Integer.compare(o1.getYearNamed(),
                (o2.getYearNamed()));
        Collections.sort(animals, reverseOrderbyYear.reversed());
        System.out.println("REVERSE ORDER BY YEAR");
        System.out.println(animals);

        // *** List all the animals alphabetically ***
        Comparator<Animals> alphabetize = (Animals o1, Animals o2) -> (o1.getName().compareTo(o2.getName()));
        Collections.sort(animals, alphabetize);
        System.out.println("\nALPHABETICAL ORDER");
        System.out.println(animals);

        //*** List all the animals order by how they move ***
        Collections.sort(animals, new Comparator<Animals>(){     
            @Override
            public int compare(Animals o3, Animals o4) {
                return (int)(o3.move("move").compareTo(o4.move("move")));
            }
        });

        Collections.sort(animals, (o3, o4) -> (o3.move("m").compareTo(o4.move("m"))));
        System.out.println("\nORDERED BY MOVEMENT TYPE");
        System.out.println(animals);
        
        // *** List only those animals the breath with lungs ***
        System.out.println("\nFILTERED BY ANIMALS WHO BREATHE WITH LUNGS");
        for (Animals filtered : animals) {
            if (filtered.breathe("breathe") == "lungs") {
                // animals2.add(filtered);
                System.out.print(filtered.name + " " + filtered.reproduce("reproducing") + " "
                        + filtered.move("moving") + " " + filtered.breathe("breathing") + " "
                        + filtered.yearNamed + "\n");
            }
        }
        
        // *** List only those animals that breath with lungs and were named in 1758 ***
        System.out.println("\nFILTERED BY ANIMALS WHO BREATHE WITH LUNGS & WERE NAMED IN 1758");
        for (Animals filtered : animals) {
            if (filtered.breathe("breathe") == "lungs" && filtered.yearNamed == 1758) {
                // animals2.add(filtered);
                System.out.print(filtered.name + " " + filtered.reproduce("reproducing") + " "
                        + filtered.move("moving") + " " + filtered.breathe("breathing") + " "
                        + filtered.yearNamed + "\n");
            }
        }
        
        //*** List only those animals that lay eggs and breath with lungs ***
        System.out.println("\nFILTERED BY ANIMALS WHO LAY EGGS & BREATHE WITH LUNGS");
        for (Animals filtered : animals) {
            if (filtered.breathe("breathe") == "lungs" && filtered.reproduce("reproducing") == "eggs") {
                // animals2.add(filtered);
                System.out.print(filtered.name + " " + filtered.reproduce("reproducing") + " "
                        + filtered.move("moving") + " " + filtered.breathe("breathing") + " "
                        + filtered.yearNamed + "\n");
            }
        }

        // *** List alphabetically only those animals that were named in 1758 ***

        System.out.println("\nFILTERED BY ANIMALS WHO WERE NAMED IN 1758");
        for (Animals filtered : animals) {
            if ( filtered.yearNamed == 1758) {
                animals2.add(filtered);

                // System.out.println(animals2);
            }
        }
                Collections.sort(animals2, new Comparator<Animals>() {
                    @Override
                    public int compare(Animals o5, Animals o6) {
                        return (int) (o5.name.compareTo(o6.name));
                    }
                });

                Collections.sort(animals2, (o5, o6) -> (o5.name.compareTo(o6.name)));
                System.out.println("ANIMALS NAMED IN 1758 IN ALPHABETICAL ORDER");
                for (Animals sorted : animals2) {
                    System.out.print(
                        sorted.name + " " + sorted.reproduce("reproducing") + " " + sorted.move("moving")
                                    + " " + sorted.breathe("breathing") + " " + sorted.yearNamed + "\n");
                }


                // System.out.print(animals2.name + " " + filtered.reproduce("reproducing") + " "
                //         + filtered.move("moving") + " " + filtered.breathe("breathing") + " "
                //         + filtered.yearNamed + "\n");

        
    }

}
