package interface_package;

public class AnonymousDemo {
  public static void main(String[] args) {
    Parent p = new Parent() {
      @Override
      public void callOnce() {
        System.out.println("Called only once");
      }
    };
    p.callOnce();
  }
}

interface Parent {
  void callOnce();
}

//class OnlyOnce implements Parent {
//  @Override
//  public void callOnce() {
//    System.out.println("Called only once");
//  }
//}
