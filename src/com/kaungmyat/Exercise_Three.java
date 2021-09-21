package com.kaungmyat;

import com.kaungmyat.Main;

import java.util.Scanner;

public class Exercise_Three {

    static class Factor {
        int A;
//        int count = 0;

        void display() {
            System.out.println("Count the number of the factors");
        }

        void input() {
            display();
            while (true) {
                System.out.println("Enter your number : ");
                Scanner scan = new Scanner(System.in);
                String b = scan.next();
                if (Main.isNumeric(b)) {
                    int a = Integer.parseInt(b);
                    A = a;
                    if (A == 0) {
                        System.out.println(" 0 have no factorial number");
                    } else {
//                        calculate();
                        System.out.println("The Factorial number is " + calculate());
                        break; }
                } else {
                    System.out.println("You have entered a string");
                }
            }
        }

        int calculate(){
            int i,count=0;
            for ( i = 1; i <= A; i++) {
                if (A % i == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Factor f = new Factor();
        f.input();
    }
}
