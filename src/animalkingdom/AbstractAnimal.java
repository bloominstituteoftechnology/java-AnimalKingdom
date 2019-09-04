package animalkingdom;

public abstract class AbstractAnimal {
    private static int currentId = 0;
    private int id;
    private String name;
    private int yearDiscovered;

    public AbstractAnimal(String name, int year) {
        id = currentId++;
        this.name = name;
        yearDiscovered = year;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public String eatsFood(String food) {
        return name + " eats " + food + ".";
    }
}