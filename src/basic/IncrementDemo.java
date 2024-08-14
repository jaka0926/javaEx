package basic;

public class IncrementDemo {
  public static void main(String[] args) {
    int x = 0;
    System.out.println("increment method start x = " + x);
    increment(x);
    System.out.println("increment method end x = " + x);
  }

  public static void increment(int n) {
    System.out.println("increment method start n = " + n);
    n++;
    System.out.println("increment method end n = " + n);
  }
}
