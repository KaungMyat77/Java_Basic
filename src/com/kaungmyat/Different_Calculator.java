package com.kaungmyat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Different_Calculator extends Prime_No {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        display();
    }
    static void display(){
        while (true) {
            System.out.println("");
            System.out.println("******************************************************");
            System.out.println("*                Hybrid Calculator                   *");
            System.out.println("******************************************************");
            System.out.println("*           1. M.Y Bank Interest Calculator          *");
            System.out.println("*           2. Prime Number Calculator               *");
            System.out.println("******************************************************");
            System.out.println("If You Want To Exit, Enter \"exit\". ");
            System.out.print("Enter Your Choose Number Only : ");
            String aa=sc.nextLine();
            if(isNumeric(aa)){
                byte cl_aa=Byte.parseByte(aa);
                if (cl_aa == 1){
                    Bank_Cal ban_cal = new Bank_Cal();
                    ban_cal.bank_cal();
                }
                else if(cl_aa == 2){
                    user_input();
                }
            }else if(aa.equals("exit")){
                System.exit(0);
            }else {
                System.out.println("Please Check Your Number.String Data Is Not Allow");
            }
        }
    }
}
 class Bank_Cal extends Different_Calculator {

         static double culDeposit = 0;
         static byte culYear = 0;
         static String store="";
         static String store1="";
         public static void bank_cal() {
             while (true) {
                 if(store.equals("exit") || store1.equals("exit")){
                     System.exit(0);
                 }
                 else {
                     culDeposit = deposit();
                     culYear = years();
                     double netAmount = totalAmount() - culDeposit;
                     NumberFormat totAmountFormat = NumberFormat.getCurrencyInstance();
                     String amountFormat = totAmountFormat.format(totalAmount());
//      System.out.println(netAmount);
                     String netFormat = totAmountFormat.format(netAmount);
                     System.out.println("Your Deposit Amount in " + culYear + " Years: " + amountFormat);
                     System.out.println("Net Deposit Amount :" + netFormat);
                     System.out.println("_______________________________________________________");
                     System.out.println("If You Want To Go Home, Enter \"home\".");
                     System.out.println("If You Want To Go Prime Calculator, Enter \"prime\".");
                     System.out.println("If You Want To Exit, Enter \"exit\". ");
                 }
             }
     }

    public static double deposit() {
        double amount=0;
        while (true) {
            System.out.println("");
            System.out.println("******************************************************");
            System.out.println("* This is Interest Rate Calculator for M.Y Bank User *");
            System.out.println("******************************************************");
            System.out.print("Enter Your Deposit Amount: ");
            Scanner userAmount = new Scanner(System.in);
            store = userAmount.nextLine();
            if(store.equals("exit")){
                System.exit(0);
            }
            else if (store.equals("home")){
                display();
            }
            else if (store.equals("prime")){
                user_input();
            }
            else if (isNumeric(store)) {
                amount=Double.parseDouble(store);
                if (amount >= 1)
                    break;
                else
                    System.out.println("Please Check Your Amounts. Amount must be start with $1");
                continue;
            }else
                System.out.println("Please Check Your Amount.String Data Is Not Allow");
            System.out.println("_______________________________________________________");
            System.out.println("If You Want To Go Home, Enter \"home\".");
            System.out.println("If You Want To Go Prime Calculator, Enter \"prime\".");
            System.out.println("If You Want To Exit, Enter \"exit\". ");

        }
        return amount;
    }
    public static byte years(){
        byte userYear=0;
        while (true){
            System.out.print("Enter Your Deposit Time(Years): ");
            Scanner yearData=new Scanner(System.in);
            store1 = yearData.nextLine();
            if(store1.equals("exit")){
                System.exit(0);
            }
            else if (store1.equals("home")){
                display();
            }
            else if (store1.equals("prime")){
                user_input();
            }
            else if(isNumeric(store1)) {
                userYear = Byte.parseByte(store1);
                if (userYear >= 1 && userYear <= 5)
                    break;
                else
                    System.out.println("Year should be enter between 1 and 5 years.");
                continue;
            }else
                System.out.println("Please Check Your Years Data.String Data Is Not Allow");
            System.out.println("_______________________________________________________");
            System.out.println("If You Want To Go Home, Enter \"home\".");
            System.out.println("If You Want To Go Prime Calculator, Enter \"prime\".");
                System.out.println("If You Want To Exit, Enter \"exit\". ");

        }
        return userYear;
    }
    public static double totalAmount(){
        final float INTEREST_RATE=0.09F;
        final byte QUARTERLY=4;
        double totalAmount=culDeposit*(Math.pow((1+(INTEREST_RATE/QUARTERLY)),(QUARTERLY*culYear)));
        return totalAmount;
    }

    public static boolean isNumeric(String strNum)  {
        if (strNum ==null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
 }
class Prime_No {
     static void user_input(){
        String nu="";
            while (true) {
                System.out.println("");
                System.out.println("****************************");
                System.out.println("* This is Prime Calculator *");
                System.out.println("****************************");
                System.out.print("Enter Your Number Here: ");
                Scanner sc = new Scanner(System.in);
                 nu=sc.nextLine();
                 if(isNumeric(nu)) {
                     double num = Double.parseDouble(nu);
//                     System.out.println(nu);
                     if (isPrime(num)) {
                         System.out.println(num + " is a prime number");
                         System.out.println("_______________________________________________________");
                         System.out.println("If You Want To Go Home, Enter \"home\".");
                         System.out.println("If You Want To Go Bank Calculator, Enter \"bank\".");
                         System.out.println("If You Want To Exit, Enter \"exit\". ");
                     } else {
                         System.out.println(num + " is not a prime number");
                         System.out.println("_______________________________________________________");
                         System.out.println("If You Want To Go Home, Enter \"home\".");
                         System.out.println("If You Want To Go Bank Calculator, Enter \"bank\".");
                         System.out.println("If You Want To Exit, Enter \"exit\". ");
                     }
                 }
                 else if(nu.equals("exit")){
                     System.exit(0);
                 }else if(nu.equals("home")){
                     Different_Calculator.display();
                 }else if(nu.equals("bank")){
                     Bank_Cal.bank_cal();
                 }
                 else{
                     System.out.println("_______________________________________________________");
                     System.out.println("If You Want To Go Home, Enter \"home\".");
                     System.out.println("If You Want To Go Bank Calculator, Enter \"bank\".");
                     System.out.println("If You Want To Exit, Enter \"exit\". ");
                     System.out.println("Please Enter Number Only! If You want to exit , Enter \"exit\". ");
                 }
            }
        }
     static boolean isPrime(double n){
        double cl_n=n;
        if (cl_n <= 1) {
            return false;
        }else if(cl_n == 2 || cl_n == 3){
            return true;
        }else {
            for (int i = 2; i < Math.sqrt(cl_n); i++) {//i<cln/2
                if (cl_n % i == 0) {
                    return false;

                }
            }
            return true;
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum ==null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
