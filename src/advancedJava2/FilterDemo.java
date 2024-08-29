package advancedJava2;

import java.util.Comparator;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream<String> s = Stream.of("a1", "a2", "b1", "c1", "c2", "c3");
    s.filter(x -> x.startsWith("c")) // c1, c2, c3
        .skip(1) // c2, c3
        .forEach(System.out::println); // c2, c3

    Stream<Integer> iStream = Stream.of(1,2,1,3,4,4);
    iStream.filter(i -> i % 2 == 0)
        .distinct() // Takes unique values(No duplicate)
        .forEach(System.out::println);

    Stream<Nation> pop = Nation.nations.stream();
    pop.filter(n -> n.getPopulation() > 100)
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .limit(2)
        .forEach(System.out::println);
  }
}
