package advancedJava2;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "d1", "d4", "a3", "c2", "b1");
    s1.sorted()
        .forEach(System.out::println);

    System.out.println("Sorted by name: ");
    Stream<Nation> n1 = Nation.nations.stream();
    n1.sorted(Comparator.comparing(Nation::getName))
        .forEach(Util::printWithParenthesis);

    System.out.println();
    System.out.println("Sorted by GDP rank: ");
    Stream<Nation> n2 = Nation.nations.stream();
    n2.sorted(Comparator.comparing(Nation::getGdpRank))
        .forEach(Util::printWithParenthesis);
  }
}
