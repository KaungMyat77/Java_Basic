package com.kaungmyat;

import java.util.Scanner;

public class string_Del {
    static String a= "Hello World";
    static String c="3";
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println(aa(a));
            }else if(b==2)
                System.out.println(percent(c));
        }

    }
    static String aa(String c){
        char d=c.charAt(c.length()-1);
        int cc= c.lastIndexOf(d);
        System.out.println(cc);
        a = c.substring(0,cc);
        return a;
    }
    static String percent(String a){
        float b=Long.parseLong(a);
        System.out.println(b);
        float c= 1+(b/100);
        return String.valueOf(c);
    }

}
