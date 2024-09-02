package advancedJava2;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new MyTask());
    thread.start();
    long before = System.currentTimeMillis();
    for (int i = 0; i < 10; i++) {
      System.out.println("This is Main");
      Thread.sleep(500);
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("MyThread");
  }
}

class MyTask implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hi!");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}
