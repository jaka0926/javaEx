package objectPackage;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if (args.length == 1) {
      System.out.println("Argument passed to main method is " + args[0]);
      return;
    }

    int[] x = {0};
    System.out.println("Before Call ==> " + x[0]);
    increment(x);
    System.out.println("After Call ==> " + x[0]);
  }
  public static void increment(int[] n) {
    System.out.println("Before adding value in method ==> " + n[0]);
    n[0]++;
  }
}
