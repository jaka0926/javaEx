package advancedJava2;

import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    Supplier<String> s = () -> "Hello";
    System.out.println(s.get());
  }
}
