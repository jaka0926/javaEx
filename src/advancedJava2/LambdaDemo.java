package advancedJava2;

public class LambdaDemo {
  public static void main(String[] args) {
    Object obj = new Object() {
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };
    MyFunction f = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };
    int max = f.max(3,5);
    System.out.println(max);
  }
}

interface MyFunction {
  public abstract int max(int a, int b);
}