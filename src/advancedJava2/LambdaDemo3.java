package advancedJava2;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
  public static void main(String[] args) {
    String[] strings = {"abcde", "a", "abc"};

//    Arrays.sort(strings, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    });

    Arrays.sort(strings, (o1,o2) -> o1.length() - o2.length());

    for (String e: strings) {
      System.out.println(e);
    }
  }
}
