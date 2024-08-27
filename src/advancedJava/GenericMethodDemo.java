package advancedJava;

public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] arr = {1,2,3,4,5};
    String[] strArr = {"Some", "Times", "I", "Do"};
//    MyUtils.show(strArr);
//    MyUtils.show(arr);
    System.out.println(MyUtils.getLast(arr));
    System.out.println(MyUtils.getLast(strArr));
  }
}

class MyUtils {
  public static <T> void show(T[] i) {
    for (T element: i) {
      System.out.println(element);
    }
  }

  public static <T> T getLast(T[] a) {
    return a[a.length - 1];
  }
}
