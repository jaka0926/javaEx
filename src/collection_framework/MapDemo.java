package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> map = Map.of("딸기", 5, "바나나", 3, "사과", 2);
    HashMap<String, Integer> hm = new HashMap<>(map);
    System.out.println(hm.size());
    hm.put("수박", 8);
    System.out.println(hm);
    System.out.println("바나나의 갯수: " + hm.get("바나나"));
  }
}
