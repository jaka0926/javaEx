package advancedJava2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }
    System.out.println(list);

//    List<Integer> gt10List = new ArrayList<>();
//
//    for (Integer l: list) {
//      if (l > 10) {
//        gt10List.add(l);
//      }
//    }
//    Collections.sort(gt10List);
//    System.out.println(gt10List.size() + " : " + gt10List);

    list.stream()
        .filter(i -> i > 10)
        .sorted()
        .forEach(e -> System.out.println(e));
  }


}
