package animalKingdomPackage;

public class Main {
    private static void animalKingdom() {
        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal armadillo = new Mammal("Armadillo", 1804);
        Mammal raccoon = new Mammal("Raccoon", 1754);
        Mammal sloth = new Mammal("Sloth", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        System.out.println(panda.toString());
        System.out.println(pigeon.toString());
        System.out.println(salmon.toString());

        System.out.println(perch.toString());
    }

    public static void main(String[] args) {
        animalKingdom();
    }
}