package collection_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"Grape", "Watermelon", "Apple", "Peach", "Lemon"};
    List<String> list = Arrays.asList(fruits);
//    Collections.sort(list);
//    Collections.reverse(list);
    Collections.sort(list, Collections.reverseOrder()); //sort then reverse
    for (String s : list) {
      System.out.println(s);
    }
  }
}
