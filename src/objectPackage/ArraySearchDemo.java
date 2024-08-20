package objectPackage;

import java.util.Arrays;

public class ArraySearchDemo {
  public static void main(String[] args) {
    int[] numbers = {77,88,66,99,11,22,33};
    int findNumber = 11;
    int findIndex = -1;
//
//    for (int i = 0; i < numbers.length; i++) {
//      if (numbers[i] == findNumber) {
//        findIndex = i;
//        break;
//      }
//    }
//
//    System.out.println("Search value: " + findNumber);
//    if(findIndex < 0)
//      System.out.println("Not Found");
//    else
//      System.out.println("Value found at index number " + findIndex);

    System.out.println("Before sorting: " + Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println("After sorting: " + Arrays.toString(numbers));
    int i = Arrays.binarySearch(numbers, 77);
    System.out.println(i);
  }
}
