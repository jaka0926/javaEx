package dataStructure;

public class SLinkedList<E> {
  private Node<E> head;
  private int size;

  public SLinkedList() {
    head = null;
    size = 0;
  }
  //탐색, 삽입, 삭제, size를 구하는 메서드 구현
  int size() {
    return size;
  }

  void addFirst(E e) {
    //1 단계
    Node<E> newNode = new Node<E>();
    newNode.e = e;
    newNode.next = head;
    //2 단계
    head = newNode;
    //3 단계
    size++;
  }
}

class Node<E> {
  E e;
  Node<E> next;
}
