package com.kaungmyat;

import java.util.Locale;
import java.util.Scanner;

public class Return {
    static class Rectangle {
        double height;//height,base
        double base;
        Rectangle(double height,double base){
            this.base=base;
            this.height=height;
//            System.out.println(base+" "+height);
        }
        double clc(){
//            System.out.println(clc1);
            return (base*height)/2;
        }

        public static void main(String[] args) {
            Rectangle rc= new Rectangle(3.5,5);
            double result =rc.clc();
            System.out.println(result);
        }
    }
    static class Student{
        String fname,lname,address;
        Student(String fname,String lname,String address){
            this.fname=fname;
            this.lname=lname;
            this.address=address;
        }
        String display(){
            String out=fname+""+lname+" live in "+address;
            return out;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter First name : ");
            String a=sc.nextLine().toUpperCase().trim();
            System.out.println(a);
            System.out.print("Enter last Name : ");
            String b=sc.nextLine().trim().toUpperCase().trim();
            System.out.print("Enter Address : ");
            String c=sc.nextLine().trim().toLowerCase(Locale.ROOT).replace(" ","");
            Student st=new Student(a,b,c);
            System.out.println(st.display());
        }
    }

}


