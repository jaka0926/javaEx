package CollectionDemo;

import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<Integer> l = List.of(10,20,30); //Cannot modify after init
    System.out.println(l);
//    l.set(0,4); throws error
    System.out.println(l);
  }
}
