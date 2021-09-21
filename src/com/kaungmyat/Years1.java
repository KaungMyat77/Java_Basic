package com.kaungmyat;

import java.io.IOException;
import java.util.Scanner;

public class Years1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Your Deposit Time(Years): ");
            Scanner yearData = new Scanner(System.in);
            byte store1 = yearData.nextByte();
//            System.out.println(store1);
            if(store1 >=1 && store1 <=5)
                break;
            else
                System.out.println("Year should be enter between 1 and 5 years.");

        }

    }



}

