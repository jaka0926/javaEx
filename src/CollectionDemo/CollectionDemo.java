package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    c.add(10);
    System.out.println(c.size());
    c.add(20);
    System.out.println(c.size());
    System.out.println(c);
    Integer[] iArr = c.toArray(new Integer[c.size()]);
    System.out.println(Arrays.toString(iArr));

    Collection<String> s = new ArrayList<>();
    s.add("A");
    s.add("B");
    s.add("C");
    System.out.println(s);
    Iterator<String> iterator = s.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

