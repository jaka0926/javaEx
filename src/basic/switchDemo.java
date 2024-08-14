package basic;

import java.util.Scanner;

public class switchDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input day: ");
    String day = in.nextLine();
    String grade = switch(day) {
      case "Mon", "Tue", "Wed", "Thu", "Fri" -> "평일입니다";
      case "Sat", "Sun" -> "주말입니다";
      default -> "오류";
    };
    System.out.println(grade);
  }
}
