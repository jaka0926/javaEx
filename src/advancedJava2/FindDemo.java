package advancedJava2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindDemo {
  public static void main(String[] args) {
    Stream<Nation> stream = Nation.nations.stream();
    Optional<Nation> any = stream.filter(n -> n.isIsland()).findAny();
    System.out.println(any.get().getName());

    stream = Nation.nations.stream();
    Optional<Nation> max = stream.max(Comparator.comparing(n -> n.getPopulation()));
    System.out.println(max.get());

    stream = Nation.nations.stream();
    long count = stream.filter(n -> n.getPopulation() > 100)
        .count();
    System.out.println(count);
  }
}
