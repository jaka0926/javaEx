package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> s = Set.of("Banana", "Apple", "Strawberry");
    System.out.println(s);
    HashSet<String> hs = new HashSet<>(s);
    hs.add("Watermelon");
    Iterator<String> iterator = hs.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    hs.add("Apple");
    System.out.println(hs);
  }
}
