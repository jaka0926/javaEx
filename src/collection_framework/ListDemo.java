package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {

    List<Integer> l = new ArrayList<>();
    l.add(0, 3);
    l.add(0, 2);
    l.add(1, 65);
    System.out.println(l);

    Integer set = l.set(1,35);
    System.out.println(l);
    System.out.println(set);
  }
}
