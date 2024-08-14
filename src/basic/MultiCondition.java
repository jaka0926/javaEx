package basic;

import java.util.Scanner;

public class MultiCondition {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("input number(1~100): ");

    int score = in.nextInt();
    String grade;
    if (score >= 90 && score <= 100) {
      grade = "A";
    }
    else if (score >= 80 && score <= 89) {
      grade = "B";
    }
    else grade = "wrong input";
    System.out.println(grade);
  }
}
