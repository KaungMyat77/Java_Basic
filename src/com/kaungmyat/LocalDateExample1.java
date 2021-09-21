package com.kaungmyat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Scanner;

public class LocalDateExample1 {
  public static void main(String[] args) {  
    LocalDate date =LocalDate.now();
    LocalDate dd=LocalDate.of(2000,12,11);
    LocalDate yesterday = date.minusDays(1);  
    LocalDate tomorrow = yesterday.plusDays(2);  
    System.out.println("Today date: "+date +" is leap year " + date.isLeapYear());
    System.out.println("Yesterday date: "+yesterday);  
    System.out.println("Tomorrow date: "+tomorrow);
    System.out.println(dd.isLeapYear());
    LocalDate date1 = LocalDate.of(2017, 1, 13);
    LocalDateTime datetime = date1.atTime(1,50,9);
    System.out.println(datetime);
  }  
}
class  LeapYear{

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Year : ");
    int aa =sc.nextInt();
    System.out.print("Enter Month : ");
    int bb= sc.nextInt();
    System.out.print("Enter Day : ");
    int cc= sc.nextInt();
    lepyear(aa,bb,cc);
  }
 static void lepyear(int a ,int b, int c){
    LocalDate ld= LocalDate.of(a,b,c);
    if(ld.isLeapYear()){
      System.out.println(ld +" is Leap Year." );
    }else{
      System.out.println(ld+ " is not Leap Year.");
    }
  }
}
class Leapyear{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Year : ");
    int a= sc.nextInt();
    Year y =Year.of(a);
    if(y.isLeap())
      System.out.println(a + " is Leap Year.");
    else
      System.out.println(a + " is not Leap Year.");
  }
}