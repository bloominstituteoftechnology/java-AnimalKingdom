package animals;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<AbstractAnimal> animalCollection = new ArrayList<AbstractAnimal>();

        //Mammals
        animalCollection.add(new Mammal("Panda", 1869));
        animalCollection.add(new Mammal("Zebra", 1778));
        animalCollection.add(new Mammal("Koala", 1816));
        animalCollection.add(new Mammal("Sloth", 1804));
        animalCollection.add(new Mammal("Armadillo", 1758));
        animalCollection.add(new Mammal("Raccoon", 1758));
        animalCollection.add(new Mammal("Bigfoot", 2021));

        //Birds
        animalCollection.add(new Bird("Pigeon", 1837));
        animalCollection.add(new Bird("Peacock", 1821));
        animalCollection.add(new Bird("Toucan", 1758));
        animalCollection.add(new Bird("Parrot", 1824));
        animalCollection.add(new Bird("Swan", 1758));

        //Fish
        animalCollectionnew.add(new Fish("Salmon", 1758));
        animalCollection.add(new Fish("Catfish", 1817));
        animalCollection.add(new Fish("Perch", 1758));


    }

}

