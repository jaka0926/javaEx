package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class ColletionEx1 {
  public static void main(String[] args) {
    Collection<String> animals = new ArrayList<>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("라마");

    for (String e: animals) {
      if (e.length() == 2) {
        System.out.println(e);
      }
    }
  }
}
