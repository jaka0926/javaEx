package objectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayDemo {
  public static void main(String[] args) {
    ArrayList<Object> elements = new ArrayList<>();
    elements.add("A");
    elements.add(true);
    elements.add(143);
    System.out.println(elements);
    System.out.println(elements.size());

    ArrayList<Circle> circles = new ArrayList<>();
    circles.add(new Circle(1));
    circles.add(new Circle(5));
    System.out.println(circles);

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(32);
    numbers.add(66);
    numbers.add(312);
    System.out.println(numbers);
  }
}
