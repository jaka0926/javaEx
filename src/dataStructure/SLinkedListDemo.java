package dataStructure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    System.out.println("LinkedList size: " + ll.size());
    ll.addFirst(10);
    System.out.println("LinkedList size: " + ll.size());
    System.out.println(ll);

    System.out.println("-----------------");
    SLinkedList<Integer> sll = new SLinkedList<>();
    System.out.println(sll.size());
    sll.addFirst(10);
    System.out.println(sll.toString());
  }
}
