package com.kaungmyat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    static double culDeposit=0;
    static byte culYear=0;
    public static void main(String[] args) {
        culDeposit= deposit();
        culYear=years();
        double netAmount=totalAmount()-culDeposit;
        NumberFormat totAmountFormat= NumberFormat.getCurrencyInstance();
        String amountFormat=totAmountFormat.format(totalAmount());
//      System.out.println(netAmount);
        String netFormat=totAmountFormat.format(netAmount);
        System.out.println("Your Deposit Amount in "+culYear+" Years: "+amountFormat);
        System.out.println("Net Deposit Amount :"+netFormat);

    }
    public static double deposit(){
        double amount=0;
        while (true) {
            System.out.print("Enter Your Deposit Amount: ");
            Scanner userAmount = new Scanner(System.in);
            String store = userAmount.nextLine();
            if (isNumeric(store)) {
                amount=Double.parseDouble(store);
                if (amount >= 1)
                    break;
                else
                    System.out.println("Please Check Your Amounts. Amount must be start with $1");
                continue;
            }else
                System.out.println("Please Check Your Amount.String Data Is Not Allow");
        }
               return amount;
    }
    public static byte years(){
        byte userYear=0;
        while (true){
            System.out.print("Enter Your Deposit Time(Years): ");
            Scanner yearData=new Scanner(System.in);
            String store1 = yearData.nextLine();
            if(isNumeric(store1)) {
                userYear = Byte.parseByte(store1);
                if (userYear >= 1 && userYear <= 5)
                    break;
                else
                    System.out.println("Year should be enter between 1 and 5 years.");
                continue;
            }else
                System.out.println("Please Check Your Years Data.String Data Is Not Allow");
        }
        return userYear;
    }
    public static double totalAmount(){
        final float INTEREST_RATE=0.09F;
        final byte QUARTERLY=4;
        double totalAmount=culDeposit*(Math.pow((1+(INTEREST_RATE/QUARTERLY)),(QUARTERLY*culYear)));
       return totalAmount;
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



