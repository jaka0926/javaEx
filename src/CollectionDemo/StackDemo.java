package CollectionDemo;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();
    st.push("A");
    st.push("B");
    st.push("C");
    System.out.println(st);
    st.add("D");
    System.out.println(st);
    System.out.println(st.search("A"));
    System.out.println(st.search("B"));
    System.out.println(st.search("C"));
    System.out.println(st.search("D"));
  }
}
