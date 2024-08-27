package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
  public static void main(String[] args) {
    List<String> sList = Arrays.asList("Rick", "Morty", "Summer");
    System.out.println(sList);
    sList.set(2, "Panda");
    System.out.println(sList);

    List<String> sList2 = new ArrayList<>(sList);
    sList2.add("Jerry");
    System.out.println(sList2);
  }
}
