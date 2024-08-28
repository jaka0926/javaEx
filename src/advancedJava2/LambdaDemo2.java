package advancedJava2;

import java.util.*;

public class LambdaDemo2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 6);
    Collections.sort(list);

//    Collections.sort(list, new Comparator<Integer>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1 - o2;
//      }
//    });

    Collections.sort(list, (i1,i2) -> i2 - i1);
    System.out.println(list);
  }
}