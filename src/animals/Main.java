package animals;

import java.util.List;
import java.util.ArrayList;

public class Main
  {
    private static List<Abstractanimal> filterAnimals(List<Abstractanimal> theList, CheckAnimal tester)
    {
      List<Abstractanimal> tempList = new ArrayList<>();

      for (Abstractanimal a : theList)
      {
        if (tester.test(v))
        {
          tempList.add(v);
        }
      }
      return tempList;
    }
    public static void main(String[] args)
    {
      //hold the line
    }
  }
}
