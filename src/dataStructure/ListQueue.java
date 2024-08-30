package dataStructure;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;
  public ListQueue() {
    front = rear = null;
    size = 0;
  }

  boolean isEmpty() {
    return (size == 0) ? true : false;
  }
  int size() {
    return size;
  }
  private class Node<E> {
    E e;
    Node<E> next;
  }

  void offer(E e) {
    dataStructure.Node<E> newNode = new dataStructure.Node<>();
    newNode.e = e;
  }
}
