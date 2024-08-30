package dataStructure;

public class SLinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SLinkedList() {
    head = tail = null;
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
    if(size == 0) {
      tail = newNode;
    }
    head = newNode;
    //3 단계
    size++;
  }

  void addLast(E e) {
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next =  tail;
    if(size == 0) {
      head = newNode;
    }
    newNode.next = tail;
    tail = newNode;
  }

  E getValue(int index) {
    Node<E> find = head;
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find.e;
  }

  Node<E> getNode(int index) {
    Node<E> find = head;
    return find;
  }
}

class Node<E> {
  E e;
  Node<E> next;
}
