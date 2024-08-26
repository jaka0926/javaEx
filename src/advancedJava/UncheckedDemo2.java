package advancedJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UncheckedDemo2 {
  public static void main(String[] args) {

    int[] array = {1,2,3};
    int[] array2 = null;
    Object result;

    try {
      result = null;
      System.out.println(result.getClass());
//      System.out.println(array[3]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of index bound");
    }
    catch (ArithmeticException e ) {
      System.out.println("Arithmetic Exception");
    }
    catch (NullPointerException e) {
      System.out.println("Null pointer Exception");
    }
    catch (Exception e) {
      System.out.println("알 수 없는 예외 발생");
    }
  }

}
