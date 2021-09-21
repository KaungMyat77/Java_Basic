package com.kaungmyat;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class OffsetTimeExample4 {
  public static void main(String[] args) {  
    OffsetTime offset = OffsetTime.now();
    int a= offset.getHour();
    int b= offset.getMinute();
    int s = offset.getSecond();  
    System.out.println(a+ " Hour");
    System.out.println(b+ " Minutes");
    System.out.println(s+ " second");

  }  
}
class OffsetDateTimeExample1 {
  public static void main(String[] args) {
    OffsetDateTime offsetDT = OffsetDateTime.now();
    System.out.println(offsetDT.getDayOfMonth());
    System.out.println(offsetDT.getDayOfYear());
    System.out.println(offsetDT.getDayOfWeek());
    System.out.println(offsetDT.toLocalDate());
  }
}
class ClockExample1 {
  public static void main(String[] args) {
    Clock c = Clock.systemDefaultZone();
    System.out.println(c.getZone());
  }
}
 class YearMonthExample1 {
  public static void main(String[] args) {
    YearMonth ym = YearMonth.now();
    System.out.println(ym);
    String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
    System.out.println(s);
    Date d =new Date();
    System.out.println(d);
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    String strDate= f.format(d);
    System.out.println(strDate);
  }
}
class CalendarExample1 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println("The current date is : " + calendar.getTime());
    calendar.add(Calendar.DATE, -15);
    System.out.println("15 days ago: " + calendar.getTime());
    calendar.add(Calendar.MONTH, 4);
    System.out.println("4 months later: " + calendar.getTime());
    calendar.add(Calendar.YEAR, 2);
    System.out.println("2 years later: " + calendar.getTime());
  }

}