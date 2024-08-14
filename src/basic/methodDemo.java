package basic;

public class methodDemo {
  public static void main(String[] args) {
    System.out.println("Sum of 1~10: " + sum(1,10));
    System.out.println("Sum of 10~100: " + sum(10,100));
    System.out.println("Sum of 100~1000: " + sum(100,1000));
  }
  public static int sum(int p1, int p2) {
    int sum = 0;
    for(int i = p1; i <= p2; i++) {
      sum += i;
    }
    return sum;
  }
}
