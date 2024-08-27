package advancedJava;

public class GenericEx1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(100);
    System.out.println(i.get());
    Box<String> s = new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());
  }
}

class Box<T> {
  private T value;

  public T get() {
    return value;
  }
  public void set(T value) {
    this.value = value;
  }
}
