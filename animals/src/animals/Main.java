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

    }

}

