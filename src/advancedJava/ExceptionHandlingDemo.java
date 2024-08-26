package advancedJava;

import java.io.IOException;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    try {
      method1();
    } catch (IOException e) {
      System.out.println("Exception occurred");
    }
  }

  public static void method1() throws IllegalArgumentException, IOException {
//    throw new IllegalArgumentException();
    throw new IOException();
  }
}
