package advancedJava2;

public class ThreadDemo2 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread().getName());

    Thread thread0 = new Thread(new Task());
    Thread thread1 = new Thread(new Task());
    Thread thread2 = new Thread(new Task());
    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        int result = 5/0;
      }
    });

    thread0.start();
    thread1.start();
    thread2.start();
    thread3.start();

  }
}

class Task implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + " : " + Thread.currentThread().getName());
      try {
        Thread.sleep(500);
      }
      catch (InterruptedException e) {

      }
    }
  }
}
