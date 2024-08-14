package basic;

import java.util.Scanner;

public class switchDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input number: ");
    int num = in.nextInt();
    String grade;

    switch(num) {
      case 10, 11, 12, 13 : grade = "A";
      break;
      case 9 : grade = "B";
      break;
      case 8 : grade = "C";
      break;
      default: grade = "Error";
    }
    System.out.println(grade);
  }
}
