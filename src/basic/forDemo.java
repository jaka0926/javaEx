package basic;

public class forDemo {
  public static void main(String[] args) {
    int sum = 0;
    for(int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("Total of 1~10: " + sum);

    int sum1 = 0;
    for (int j = 10; j <= 100; j++) {
      sum1 += j;
    }
    System.out.println("Total of 10~100: " + sum1);

    int sum2 = 0;
    for (int j = 100; j <= 1000; j++) {
      sum2 += j;
    }
    System.out.println("Total of 100~1000: " + sum2);
  }
}
