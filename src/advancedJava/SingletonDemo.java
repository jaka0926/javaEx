package advancedJava;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton.getValue();
    System.out.println(Singleton.getValue());
  }
}

class Singleton {
  private static Singleton singleton = new Singleton();
  private Singleton() {
  }

  public static int getValue() {
    return 0;
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
