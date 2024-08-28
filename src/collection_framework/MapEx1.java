package collection_framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {
  public static void main(String[] args) {
    Map<String, Integer> map = new Hashtable<>();

    map.put("Rony", 80);
    map.put("Sam", 90);
    map.put("Candace", 82);
    map.put("Victor", 76);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input name: ");
    String score = scanner.nextLine();
    if (score != null) {
      System.out.println(map.get(score));
    }
    else {
      System.out.println("Name not found");
    }
   }
}
