package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class ListQueueDemo {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(10);
    q.offer(20);
    q.offer(30);
    while(!q.isEmpty()) {
      System.out.println(q.poll());
    }
    Integer poll = q.poll();
    ListQueue<Integer> lq = new ListQueue<>();
    System.out.println(lq.isEmpty());
    System.out.println(lq.size());
  }
}
