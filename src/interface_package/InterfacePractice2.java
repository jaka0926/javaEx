package interface_package;

public class InterfacePractice2 {
  public static void main(String[] args) {
    Human.echo();
    Student s = new Student(20);
    s.print();
    s.eat();
    System.out.println();
    Human p = new Worker();
    p.print();
    p.eat();
  }
}
