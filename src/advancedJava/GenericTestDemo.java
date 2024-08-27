package advancedJava;
import java.util.ArrayList;

public class GenericTestDemo {
  public static void main(String[] args) {
    ArrayList<Integer> intArray = new ArrayList<>();
    intArray.add(2);
    intArray.add(20);
    intArray.add(14);
    System.out.println(intArray);

    ArrayList<String> strArray = new ArrayList<>();
    strArray.add("First");
    strArray.add("Second");
    strArray.add("Third");
    System.out.println(strArray);

    ArrayList<Object> objArray = new ArrayList<>();
    objArray.add(new Circle(50));
    objArray.add(new Person(6789, "Joker"));
    objArray.add(12);
    objArray.add("String example");
    Integer i = (Integer) objArray.get(2);
    System.out.println(i + 10);

    System.out.println(objArray.toString());
  }
}
