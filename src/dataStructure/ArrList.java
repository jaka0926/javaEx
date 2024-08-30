package dataStructure;

public class ArrList<E> {
  private E[] a;
  private int size;

  public ArrList() {
    this.a = (E[])(new Object[1]);
    this.size = 0; //Capacity is 1, size is 0(since there's no data in)
  }

  public int size() {
    return size;
  }

  public boolean add(E e) {

    if(a.length == size) {
      E[] t = (E[]) new Object[size * 2];
      for (int i = 0; i < size; i++) {
        t[i] = a[i];
      }
      a = t;
    }
    a[size] = e;
    size++;
    return true;
  }
}
