package com.kaungmyat;

import java.util.Scanner;

public class User_History {
   static String history="";
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Here : ");
            byte userData = sc.nextByte();
            String usHistory = String.valueOf(userData);
//            System.out.println(usHistory +"us data");
            System.out.println(history.contains(usHistory));
            if(history.contains(usHistory)){
                System.out.println("cannot Input");
                continue;
            }else {
                System.out.println("Enter else");
                history = history + usHistory;
                System.out.println(history + " global");
            }

        }

    }
    static boolean isHistory(String a, String b){
        if(a.contains(b)){
            return true;
        }else{
            return false;
        }
    }


}
