package objectPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Array1Scanner {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long scores[] = new long[5];
    long sum = 0;
    System.out.println(Arrays.toString(scores));

    for (int i = 0; i < scores.length; i++) {
      System.out.printf("Enter number %d: ", i + 1);
      scores[i] = in.nextLong();
    }
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    System.out.println(Arrays.toString(scores));
    System.out.println(sum);
    System.out.println("Average: " + sum / (double)scores.length);
  }
}
