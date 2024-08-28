package advancedJava2;

public class MethodRefDemo {
  public static void main(String[] args) {
    Mathemarical m = Math::abs;
    System.out.println(m.calculate(-3.4));
  }
}

interface Mathemarical {
  double calculate(double d);
}
