package basic;

import java.util.Scanner;

public class DivByZeroDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    System.out.println("Scanner comparison after declared each== " + (in == in2));

    in2 = in;
    System.out.println("Scanner comparison after copying address value== " + (in == in2));

//    System.out.println(in);
//    System.out.println(in2);
//    int result = 5/i;
//    double result = 5 / 0.0;
//    double result = 5 % 2.0;
//    System.out.printf("5 divided by %d is %d", i, result);
//    System.out.printf("remainder is: %f", result);
  }
}
