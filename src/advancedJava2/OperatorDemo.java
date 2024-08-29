package advancedJava2;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
  public static void main(String[] args) {
    UnaryOperator<String> addStrings = s -> s + "!!!";
//        new UnaryOperator<String>() {
//      @Override
//      public String apply(String s) {
//        return s + "!!!";
//      }
//    };

    System.out.println(addStrings.apply("Hello World"));

    BinaryOperator<String> concant = (s, s2) -> s + ", " + s2;
//        new BinaryOperator<String>() {
//      @Override
//      public String apply(String s, String s2) {
//        return s + "," + s2;
//      }
//    };
    System.out.println(concant.apply("First", "Last"));
  }
}
