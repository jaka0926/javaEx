package advancedJava2;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorDemo {
  public static void main(String[] args) {
    Set<String> nationNames = Nation.nations.stream()
        .map(n -> n.getName())
        .collect(Collectors.toSet());

    for (String nationName: nationNames) {
      System.out.println(nationName);
    }

    Set<Nation.Type> collect = Nation.nations.stream()
        .map(n -> n.getType())
        .collect(Collectors.toSet());

    for (Nation.Type nationtype: collect) {
      System.out.println(nationtype);
    }

    Set<String> nations = Nation.nations.stream()
        .map(n -> n.getName())
        .limit(3)
        .collect(Collectors.toSet());

    for (String s: nations) {
      System.out.print(s + " ");
    }

    System.out.println();
    Map<String, Double> nationsMap = Nation.nations.stream()
        .filter(Nation::isIsland)
        .collect(Collectors.toMap(Nation::getName, Nation::getPopulation));

    System.out.println(nationsMap);
  }
}
