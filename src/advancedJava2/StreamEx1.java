package advancedJava2;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expressions",
        "java8 supports lambda expressions"
    );
//    list.stream()
//        .filter(e -> e.toLowerCase().contains("java"))
//        .forEach(System.out::println);

    list.stream().filter(e -> e.toLowerCase().contains("java"))
        .forEach(System.out::println); // using forEach with lambda expression
  }
}
