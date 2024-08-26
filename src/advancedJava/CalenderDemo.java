package advancedJava;

import java.util.Calendar;

public class CalenderDemo {
  public static void main(String[] args) {
    System.out.println(Calendar.getAvailableCalendarTypes());
    Calendar c = Calendar.getInstance();
    System.out.println(c);
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
  }
}
