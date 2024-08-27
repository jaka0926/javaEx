package CollectionDemo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> grades = new ArrayList<>();

    while (true) {
      System.out.print("점수를 입력하세요: ");
      try {
        grades.add(scanner.nextInt());
      }
      catch (InputMismatchException e) {
        System.out.println("숫자만 입력 가능합니다");
        break;
      }

      if (grades.get(grades.size() - 1) < 0) {
        grades.remove(grades.size() - 1);
        break;
      }
    }
    int sum = 0;
    System.out.print("학생들의 성적: ");
    for (int el: grades) {
      System.out.print(el + " ");
      sum += el;
    }
    System.out.println();
    double averageScore = (double) sum / grades.size();
    System.out.println("Sum total: " + sum);
    System.out.printf("Average grade is: %.1f",averageScore);
  }

  public void scan() {

  }
}
