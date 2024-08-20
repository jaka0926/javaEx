package objectPackage;

public class StringDemo {
  public static void main(String[] args) {
//    String s1 = new String();
//    String s2 = new String("A");
//
//    System.out.println("s1 \"" + s1 + "\"");
//    System.out.println("s2 \"" + s2 + "\"");
//
//    String s3 = "First";
//    String s4 = s3;
//    System.out.println("s3와 s4를 동일 객체로 공유했을 때");
//    System.out.println("s3 \"" + s3 + "\"");
//    System.out.println("s4 \"" + s4 + "\"");
//
//    s3 = "WOW";
//    System.out.println("s3 의 값을 변경했을때");
//    System.out.println("s4 \"" + s4 + "\"");
//    System.out.println("s3 \"" + s3 + "\"");

    String s1 = "Java";
    String s2 = "java";
    String s3 = new String("Html");

    int compareResult = s1.compareTo(s2);
    if(compareResult == 0) {
      System.out.println("s1 and s2 are same");
    }
    System.out.println(compareResult);

//    System.out.println("(identity) s1 == s2 : " + (s1 == s2));
//    System.out.println("(identity) s1 == s3 : " + (s1 == s3));
//    System.out.println("s1 equals s3 : " + (s1.equals(s3)));
//
//    s1 = s3;
//    System.out.println("after s1 = s3");
//    System.out.println("(identity) s1 == s2 : " + (s1 == s2));
//    System.out.println("s1 equals s3 : " + (s1.equals(s3)));
  }
}
