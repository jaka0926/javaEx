package basic;

public class methodDemo3 {
  public static void main(String[] args) {
    System.out.printf("5 + 4 = %d\n", add(5, 4));
    System.out.println(sub(240, 100));
    System.out.println(multi(20, 5));
    System.out.println(div(200, 100));
    System.out.println(multiply(2_000_000, 1_000_000));
    System.out.printf("%.4f\n", DoubleDiv(313, 21));
  }
  public static int add(int p1, int p2) {
    return p1 + p2;
  }
  public static int sub(int p1, int p2) {
    return p1 - p2;
  }
  public static int multi(int p1, int p2) {
    return p1 * p2;
  }
  public static int div(int p1, int p2) {
    return p1 / p2;
  }
  public static long multiply(int p1, int p2) {
    return (long)p1 * p2;
  }
  public static double DoubleDiv(int p1, int p2) {
    return (double)p1 / p2;
  }
}
