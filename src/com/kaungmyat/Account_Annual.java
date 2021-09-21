package com.kaungmyat;
import java.util.Scanner;
public class Account_Annual {

    public static void main(String[] args) {
        float rate = 8/100F ;
        System.out.println("Principle : ");
        Scanner scan = new Scanner(System.in);
        double Principle1 = scan.nextDouble();
//        float Principle = Integer.parseInt(Principle1);
        if (Principle1 <= 0) {
            System.out.println("Please enter Bigger than 0");
        }




        System.out.println("Number of years : ");
        Scanner scan1 = new Scanner(System.in);
        byte year1 = scan.nextByte();
        if (year1 <= 0){
             System.out.println("Please enter Bigger than 0");}


        //Compounded interest
        final int comInterest = 4;



        // A = P( 1 + (r / n ) ) ^ n  t
        // Annual


        int a =  comInterest* year1;
        float b =  rate/ (float) comInterest;
        System.out.println(a+"   "+b);
        float c = (float) (Principle1 * Math.pow((1+ b),a));
        float mortgage1 = (float) (c - Principle1);
        System.out.println("Annual mortgage : " + mortgage1);

        System.out.println("--------------------------");
            //Monthly
            /*float d = (float)comInterest*1/12;
            float e = (float) (Principle * Math.pow((1+ b),d));
            float mortgage2 = e - Principle;
            System.out.println("Monthly mortgage : " + mortgage2);*/
    }
    public void even(int n){

    }



            }






























































