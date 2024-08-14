package basic;

import java.util.Scanner;

public class TernaryOperatorDemo {
  public static void main(String[] args) {
//    int i = 12;
//    int res = i % 2;
//    String name = res == 0 ? "even" : "odd";
//    System.out.printf("%d 는 %s 입니다", i, name);

    Scanner in = new Scanner(System.in);
    System.out.print("Input number: ");
    int x = in.nextInt();
    String numType = x >= 0 ? "positive number" : "negative number";
    System.out.println(numType);
  }
}
