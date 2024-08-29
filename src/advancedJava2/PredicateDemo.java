package advancedJava2;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class PredicateDemo {
  public static void main(String[] args) {
    IntPredicate even = i -> i % 2 == 0;
    System.out.println(even.test(3));
    System.out.println(even.test(4));

//        new IntPredicate() {
//      @Override
//      public boolean test(int value) {
//        return value % 2 == 0;
//      }
//    };
    BiPredicate<Integer, Integer> bi = (i, j) -> i == j;
    System.out.println(bi.test(2,2));
  }
}
