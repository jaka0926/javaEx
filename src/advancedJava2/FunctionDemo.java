package advancedJava2;

import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
    Function<String, Integer> lengthCount = s -> s.length();
  }
}
