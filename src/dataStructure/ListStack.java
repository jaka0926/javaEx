package dataStructure;

public class ListStack<E> {
  Node<E> top;
  int size;

  public ListStack() {
    top = null;
    size = 0;
  }

  boolean isEmpty() {
    return (size == 0) ? true : false;
  }
  int size() {
    return size;
  }
  E peek() {
    return top.e;
  }
  void push(E e) {
    Node<E> newNode = new Node<>();
    newNode.e = e;
  }
}
