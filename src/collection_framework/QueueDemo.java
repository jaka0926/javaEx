package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    System.out.println(q.size());
    System.out.println(q.isEmpty());
    q.offer("A");
    q.offer("B");
    q.offer("C");
    System.out.println(q);
    System.out.println(q.peek());
  }
}
