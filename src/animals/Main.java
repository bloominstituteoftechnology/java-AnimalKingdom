package animals;
import java.util.*;


public class Main {
    public static void main(String[] args){
        
        Mammals Panda = new Mammals("Panda", 1869);
        System.out.println(Panda);
        Panda.eat();


        List<Mammals> mammalList = new ArrayList<>();
        mammalList.add(new Mammals("Panda", 1869));
        mammalList.add(new Mammals("Zebra", 1778));
        mammalList.add(new Mammals("Koala", 1816));
        mammalList.add(new Mammals("Sloth", 1804));
        mammalList.add(new Mammals("Armadillo", 1758));
        mammalList.add(new Mammals("Raccoon", 1758));
        mammalList.add(new Mammals("Bigfoot", 2021));

        List<Birds> birdList = new ArrayList<>();
        birdList.add(new Birds("Pigeon", 1837));
        birdList.add(new Birds("Peacock", 1821));
        birdList.add(new Birds("Toucan", 1758));
        birdList.add(new Birds("Parrot", 1824));
        birdList.add(new Birds("Swan", 1758));

        List<Fish> fishList = new ArrayList<>();
        fishList.add(new Fish("Salmon", 1758));
        fishList.add(new Fish("Catfish", 1817));
        fishList.add(new Fish("Perch", 1758));
        System.out.println(fishList.size());

    }
}