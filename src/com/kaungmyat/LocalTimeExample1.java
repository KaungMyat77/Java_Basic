package com.kaungmyat;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample1 {
  public static void main(String[] args) {  
    LocalTime time = LocalTime.now();  
    System.out.println(time);
    LocalTime time1 = LocalTime.of(10,43, 12);
    System.out.println(time1);
    LocalTime time2=time1.minusHours(2);//plusHours
    LocalTime time3=time2.plusMinutes(18);//minusMinutes
    System.out.println(time3);
  }  
}
 class LocalTimeExample5 {
  public static void main(String... args) {
    ZoneId zone1 = ZoneId.of("Asia/Kolkata");
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");
    LocalTime time1 = LocalTime.now(zone1);
    System.out.println("India Time Zone: "+time1);
    LocalTime time2 = LocalTime.now(zone2);
    System.out.println("Japan Time Zone: "+time2);
    long hours = ChronoUnit.HOURS.between(time1, time2);
    System.out.println("Hours between two Time Zone: "+hours);
    long minutes = ChronoUnit.MINUTES.between(time1, time2);
    System.out.println("Minutes between two time zone: "+minutes);
  }
}

class LocalDateTimeExample1 {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Before Formatting: " + now);
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("DD-MM-yy hh:mm:ss");
    String fDateTime = now.format(format1);
    System.out.println("After Formatting: " + fDateTime);
    LocalDateTime crn= LocalDateTime.of(2012,9,12,17,40,59);
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatDateTime = crn.format(format);
    System.out.println("After Formatting: " + formatDateTime);
    DateTimeFormatter f= DateTimeFormatter.ofPattern("dd MM yyyy -> hh:mm:ss ");
    String aa= now.format(f);
    System.out.println(now.format(f));
  }
}
 class LocalDateTimeExample3 {
  public static void main(String[] args) {
    LocalDateTime a = LocalDateTime.of(2021, 7, 30, 19, 2);
    System.out.println(a.get(ChronoField.DAY_OF_WEEK));
    System.out.println(a.get(ChronoField.DAY_OF_YEAR));
    System.out.println(a.get(ChronoField.DAY_OF_MONTH));
    System.out.println(a.get(ChronoField.HOUR_OF_DAY));
    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
  }
}
 class MonthDayExample1 {
  public static void main(String[] args) {
    MonthDay month = MonthDay.now();
    LocalDate date = month.atYear(1994);
    System.out.println(date);
  }
}