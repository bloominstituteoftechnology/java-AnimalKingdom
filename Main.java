package AnimalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void filterAnimals(List<AbstractAnimals> animals, CheckAnimals tester){
        for (AbstractAnimals v : animals){
            if(tester.test(v)){
                System.out.println(v);
            }
        }
    }
    public static void main(String[] args){

         // Create Mammals
            Mammals Panda = new Mammals(1869, "Panda");
            Mammals Zebra = new Mammals(1778, "Panda");
            Mammals Koala = new Mammals(1816, "Koala");
            Mammals Sloth = new Mammals(1804, "Sloth");
            Mammals Armadillo = new Mammals(1758, "Armadillo");
            Mammals Raccoon = new Mammals(1758, "Raccoon");
            Mammals Bigfoot = new Mammals(2021, "Bigfoot");
            
         // Create Birds
            Birds Pigeon = new Birds(1837, "Pigeon");
            Birds Peacock = new Birds(1821, "Peacock");
            Birds Toucan = new Birds(1758, "Toucan");
            Birds Parrot = new Birds(1824, "Parrot");
            Birds Swan = new Birds(1758, "Swan");

        // Create Fish
            Fish Salmon = new Fish(1758, "Salmon");
            Fish Catfish = new Fish(1817, "Catfish");
            Fish Perch = new Fish(1758, "Perch");

            List<AbstractAnimals> myList = new ArrayList<>();
            myList.add(Panda);
            myList.add(Zebra);
            myList.add(Koala);
            myList.add(Sloth);
            myList.add(Armadillo);
            myList.add(Raccoon);
            myList.add(Bigfoot);
            myList.add(Pigeon);
            myList.add(Peacock);
            myList.add(Toucan);
            myList.add(Parrot);
            myList.add(Swan);
            myList.add(Salmon);
            myList.add(Catfish);
            myList.add(Perch);

            // System.out.println(myList);

            // * [ ] List all the animals in descending order by year named
            myList.sort((a, b) -> a.getYear() - b.getYear());
            // System.out.println(myList);
            // * [ ] List all the animals alphabetically
            myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
            // System.out.println(myList);
            // * [ ] List all the animals order by how they move
            // myList.sort((v1, v2) -> v1.move() - v2.move());
            // * [ ] List only those animals the breath with lungs
            filterAnimals(myList, v -> v.breath() == "Lungs");
            // * [ ] List only those animals that breath with lungs and were named in 1758
            filterAnimals(myList, v -> (v.breath() == "Lungs") && (v.getYear() == 1758));
            // * [ ] List only those animals that lay eggs and breath with lungs
            filterAnimals(myList, v -> (v.reproduce() == "Eggs") && (v.breath() == "Lungs"));
            // * [ ] List alphabetically only those animals that were named in 1758
            myList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
            filterAnimals(myList, v -> (v.getYear() == 1758));
    } 
}