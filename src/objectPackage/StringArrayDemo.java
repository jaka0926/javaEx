package objectPackage;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {

    String[] names = new String[3];
    System.out.println(Arrays.toString(names));
    names[0] = "Rick Sanchez";
    names[1] = "Morty Smith";
    names[2] = "Summer Smith";

    System.out.println(Arrays.toString(names));
    for (String name: names) {
      System.out.println("length: " + name.length());
    }
  }
}
