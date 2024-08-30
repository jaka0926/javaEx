package dataStructure;

import java.util.ArrayList;

public class ArrListDemo {
  public static void main(String[] args) {
    ArrList<Integer> arr = new ArrList<>();
    System.out.println(arr.size());
    boolean add = arr.add(10);
    arr.add(20);
    System.out.println(add);
    System.out.println(arr.size());

    System.out.println();
    ArrayList<Integer> javaArr = new ArrayList<>();
    System.out.println(javaArr.size());
    javaArr.add(10);
    System.out.println(javaArr.size());
  }
}
