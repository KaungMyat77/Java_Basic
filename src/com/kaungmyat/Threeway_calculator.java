package com.kaungmyat;

import java.text.NumberFormat;
import java.util.Scanner;

public class Threeway_calculator {

    static class Account_Annual {
        static double Principle;
        static short year;
        void depositCalculate() {
            while (true) {
                try {
                    System.out.print("Principle : ");
                    Scanner scan = new Scanner(System.in);
                    Principle = scan.nextDouble();
                    if (Principle >= 1) {
                        break;
                    }else{
                        System.out.println(" The amount must be bigger than 1 $");
                    }
                } catch (Exception sterror) {
                    System.out.println("String Data is not allowed");
                }
            }
            //Year and error check
            while (true) {
                try {
                    System.out.print("Number of years : ");
                    Scanner scan1 = new Scanner(System.in);
                    year = scan1.nextShort();
                    if (year > 0) {
                        break;
                    } else {
                        System.out.println("Years must be bigger than 1");
                    }
                } catch (Exception sterror) {
                    System.out.println("String Data is not allowed");
                }
            }
            //Calculate
            float rate = 8 / 100F;
            final int comInterest = 4;
            //Currency Format
            NumberFormat aa = NumberFormat.getCurrencyInstance();
            //Yearly Calculate
            double a = (double) comInterest * year;
            double b = (double) rate / comInterest;
            double c = (double) (Principle * Math.pow((1 + b), a));
            double mortgage1 = c - Principle;
            String yearlyMortgage = aa.format(mortgage1);
            System.out.println("Annual mortgage : " + yearlyMortgage);
            System.out.println("********************************");
            //Monthly Calculate
            double d = (double) comInterest * year / 12;
            double e = (double) (Principle * Math.pow((1 + b), d));
            double mortgage2 = e - Principle;
            String monthlyMortgage = aa.format(mortgage2);
            System.out.println("Monthly mortgage : " + monthlyMortgage);
        }
    }

    static class Prime {
        void primeCalculate() {
            System.out.print("Here is Prime Calculator : ");
            Scanner scan = new Scanner(System.in);
            String aa = scan.nextLine();
            try {
                int bb = Integer.parseInt(aa);
                System.out.println();
                // Calculate
                if (bb == 2 || bb ==3 ) {
                    System.out.println(bb+" are Prime Number");
                } else if ( bb <=1) {
                    System.out.println(bb+" is not Prime number.");
                } else {
                    for (int i = 2; i < Math.sqrt(bb); i++) {
                        if (bb % i == 0) {
                            // For print Statement to use if true print something
                            // If not loop will be iterate until the end of bb
                            //and show the output everytime the number is divided by i
//                            boolean isPrime = true;
                            System.out.println(bb + " is not prime number");
                        } else {
                            System.out.println(bb + " is prime number");
                        }
                        break;
                    }
                }
            } catch (Exception sterror) {
                System.out.println("Enter a Number not a string ");

            }
        }
    }

    static class OddEven {
        void oddEvenCalculate() {
            System.out.println("Here is Odd Even Calculator");
            Scanner scan = new Scanner(System.in);
            String c = scan.nextLine();
            try {
                int b = Integer.parseInt(c);
                if (b % 2 == 0 || b == 0) {
                    System.out.println( b+"Even Number");
                } else {
                    System.out.println(b+"Odd number");
                }
            } catch (Exception e) {
                System.out.println("You have entered String");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println(" Welcome to three_way_calculator ");
        System.out.println("*********************************");
        System.out.println("Here are your options\nType 1 for Prime Calculator\nType 2 for " +
                "Odd Even Calculator\nType 3 for Deposit");
        System.out.print("Enter your number : ");
        Scanner scan = new Scanner(System.in);
        String oo = scan.nextLine();
            try {
                byte tt = Byte.parseByte(oo);
                if (tt > 3 || tt < 1) {
                    System.out.println("You have entered wrong number");
                } else {
                    switch (tt) {
                        case 1:
                            Prime ll = new Prime();
                            ll.primeCalculate();
                            break;
                        case 2:
                            OddEven mm = new OddEven();
                            mm.oddEvenCalculate();
                            break;
                        case 3:
                            Account_Annual hh = new Account_Annual();
                            hh.depositCalculate();
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("You have entered String");
            }
    }
}





