package dataStructure;

public class ListStackDemo {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
    if(!stack.isEmpty()) {
      stack.peek();
    }
  }
}
