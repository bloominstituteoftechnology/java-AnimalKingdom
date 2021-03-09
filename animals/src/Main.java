package animals.src;

public class Main
{
    public static void main(String[] args)
    {
        // | Name | Year Named |
        // | --------- | ---------- |
        // | Panda | 1869 |
        // | Zebra | 1778 |
        // | Koala | 1816 |
        // | Sloth | 1804 |
        // | Armadillo | 1758 |
        // | Raccoon | 1758 |
        // | Bigfoot | 2021 |
        Mammal panda = new Mammal(1, "Panda", 1869);
        Mammal zebra = new Mammal(2, "Zebra", 1778);
        Mammal koala = new Mammal(3, "Koala", 1816);
        Mammal sloth = new Mammal(4, "Sloth", 1804);
        Mammal armadillo = new Mammal(5, "Armadillo", 1758);
        Mammal raccoon = new Mammal(6, "Raccoon", 2021);
        Mammal bigfoot = new Mammal(7, "Bigfoot", 2021);

        // | Name | Year Named |
        // | ------- | ---------- |
        // | Pigeon | 1837 |
        // | Peacock | 1821 |
        // | Toucan | 1758 |
        // | Parrot | 1824 |
        // | Swan | 1758 |
        Bird pigeon = new Bird(8, "Pigeon", 1837);
        Bird peacock = new Bird(9, "Peacock", 1821);
        Bird toucan = new Bird(10, "Toucan", 1758);
        Bird Parrot = new Bird(11, "Parrot", 1824);
        Bird Swan = new Bird(12, "Swan", 1758);
        // | Name | Year Named |
        // | ------- | ---------- |
        // | Salmon | 1758 |
        // | Catfish | 1817 |
        // | Perch | 1758 |
    }
}
