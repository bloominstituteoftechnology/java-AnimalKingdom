package animalApp;

public class Main {
  public static void main(String[] args) {
    Mammals myMammal = new Mammal("Bear");
    myMammal.eat(15);
    myMammal.addFood(5);
    myMammal.move();
    
    System.out.println(myMammal.getName());
    System.out.println(myMammal.getPath());
    System.out.println(myMammal.getFoodLevel());
    System.out.println("myMammal");
  }
}
