package advancedJava;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    String[] weekName = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    String[] noonName = {"AM", "PM"};
    Calendar c = Calendar.getInstance();

    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DAY_OF_MONTH);
    String weekday = weekName[c.get(Calendar.DAY_OF_WEEK) - 1];
    String noon = noonName[c.get(Calendar.AM_PM)];
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "year " + month + "month " + day + "day ");
    System.out.println(weekday + " " + noon);
    System.out.println(hour + "h " + minute + "min " + second + "sec");
  }
}

