package animalkingdom;

public abstract class AbstractAnimal {
    private static int maxId = 0;
    private int id;
    int food = 0;
    int year;

    public AbstractAnimal(int food, int year) {
        maxId++;
        id = maxId;
        this.food = food;
        this.year = year;
    }

    public AbstractAnimal(int year) {
        maxId++;
        id = maxId;
        this.year = year;
        food = 10;
    }

    public AbstractAnimal() {
        maxId++;
        id = maxId;
        year = 2019;
        food = 10;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
    public abstract String getName();

    public int getYear() {
        return year;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void useFood() {
        this.food--;
    }

    public int getFoodLevel() {
        return food;
    }
}