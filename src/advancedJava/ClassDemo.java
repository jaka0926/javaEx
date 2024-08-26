package advancedJava;

import exercise.Line;

public class ClassDemo {
  public static void main(String[] args) {
    Line line = new Line(10);

    Class aClass = line.getClass();
    System.out.println(aClass.getClass());
    System.out.println(aClass.getName());
    System.out.println(aClass.getSimpleName());
    System.out.println(aClass.getPackageName());
  }
}
