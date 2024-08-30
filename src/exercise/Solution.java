package exercise;

import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    solution(12);
  }
  public static int solution(int n) {
    int nums = 0;
    for (int i = n; i > 0; i--) {
      if (n % i == 0) {
        nums += i;
      }
    }
    return nums;
  }
}
