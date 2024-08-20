package objectPackage;

import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args) {
    int[] num = {10,20,30};
    System.out.println(Arrays.toString(num));

    for (int i = 0; i < num.length; i++) {
      if (i != num.length - 1) {
        System.out.print(num[i] + ", ");
      }
      else
        System.out.print(num[i]);
    }
    System.out.println();
    int[] newNum = new int[5];

    for (int i = 0; i < newNum.length; i++) {
      if (i != newNum.length - 1) {
        System.out.print(newNum[i] + ", ");
      }
      else
        System.out.print(newNum[i]);
    }

    System.out.println();
    newNum = num;
    System.out.println(num);
    System.out.println(newNum);
  }
}
