package basic;

import java.util.Scanner;

public class methodDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input number: ");
    int num = in.nextInt();
    System.out.println(evenOrOdd(num));
  }
  public static String evenOrOdd(int num) {
    return num % 2 == 0 ? "Even" : "Odd";
  }
}
