package advancedJava2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("Jack", 30),
        new Member("Bobby", 40),
        new Member("Sansa", 26)
    );
    double avg = list.stream()
        .mapToInt(Member::getAge)
        .average()
        .getAsDouble();
    System.out.println("Average age: " + avg);
  }
}

class Member {
  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
