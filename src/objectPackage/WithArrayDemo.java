package objectPackage;

public class WithArrayDemo {
  public static void main(String[] args) {
    int[] scores = {90, 75, 85, 75, 80, 90, 100, 60, 99, 88};
    String[] names = {"hey"};
    int sum = 0;
    System.out.println(scores.length);
    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + ", ");
      sum += scores[i];
    }
    System.out.println();
    System.out.println(sum);
    System.out.println(sum / 10);
  }
}
