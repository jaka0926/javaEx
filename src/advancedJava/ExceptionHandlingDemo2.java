package advancedJava;

public class ExceptionHandlingDemo2 {
  public static void main(String[] args) {
    try {
      System.out.println(Integer.parseInt("a"));
    }
    catch (NumberFormatException e) {
      throw new NumberFormatException();
    }
  }
}
