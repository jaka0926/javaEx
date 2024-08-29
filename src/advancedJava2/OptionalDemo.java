package advancedJava2;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = null;

    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);

    if(o1.isPresent()) { Util.print(o1.get()); }
    else {
      System.out.println("Not present");
      Util.print(o1);
    }

    o1.ifPresent(Util::print);

//    String result = o2.orElse("No value");
//    System.out.println(result);
    System.out.println();
    Util.printWithParenthesis(o2.orElse("No value"));
  }
}
