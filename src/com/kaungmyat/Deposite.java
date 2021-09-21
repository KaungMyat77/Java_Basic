package com.kaungmyat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Deposite {
    static double Store;
    static byte Year1;
    public static void main(String[] args) {
//        user error check
       while (true) {
           try {
               System.out.print("Enter Your Deposit Amount: ");
               Scanner userAmount = new Scanner(System.in);
               Store = userAmount.nextDouble();// error start
               if (Store >= 1) {
                   break;
               } else {
                   System.out.println("Please Check Your Amounts. Amount must be start with $1");
               }
           }catch (Exception sterror){
               System.out.println("Please Check Your Amount.String Data Is Not Allow");
           }
       }
        while (true) {
            try {
                System.out.print("Enter Your Deposit Time(Years): ");
                Scanner yearData = new Scanner(System.in);
                Year1 = yearData.nextByte();
//            System.out.println(store1);
                if (Year1 >= 1 && Year1 <= 5)
                    break;
                else
                    System.out.println("Year should be enter between 1 and 5 years.");
            }catch (Exception strError2){
                System.out.println("Please Check Your Years Data.String Data Is Not Allow");
            }

        }
//       user error check complete

       final float RATE =0.08F;
       final byte QUARTERLY =4;
       double totalAmount= Store * Math.pow((1+(RATE/QUARTERLY)),(QUARTERLY * Year1));
//        formula finish

//        format money amount
        NumberFormat aa= NumberFormat.getCurrencyInstance();
        String bb=aa.format(totalAmount);
        double cc=totalAmount- Store;
        String dd=aa.format(cc);
//        output
        System.out.println("Your Deposit Amount "+ Year1 +" years: " +bb);
        System.out.println("Your Interest Amount :"+dd);
    }

}
