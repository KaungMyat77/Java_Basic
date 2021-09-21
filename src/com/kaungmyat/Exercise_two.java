package com.kaungmyat;


import java.util.Scanner;

public class Exercise_two {
    static class input {
        Scanner scan = new Scanner(System.in);
        String A;
        String B;
        int I;

        void display() {
            System.out.println("Which Number is larger?\nReturn 0 if the value are the same and \nReturn the" +
                    " smaller remainder if the value have the same remainder when divided by 6");
        }

        void input() {
            while(true) {
                display();
                System.out.println("First Number : ");
                String a = scan.next();
                A = a;
                if (Main.isNumeric(a)) {
                    System.out.println("Second Number : ");
                    String b = scan.next();
                    B = b;
                    if (Main.isNumeric(b)) {
                        calculate();
                        break;
                    } else {
                        System.out.println("You have entered a string");
                    }
                } else {
                    System.out.println("You have entered a string");
                }
            }
        }


        void calculate() {
            int e = Byte.parseByte(A);
            int f = Byte.parseByte(B);

            if (e == f) {
                System.out.println("The answer is 0");
            } else {
                if (e > f) {
                    if ((e % 6) == 0 && (f % 6) == 0) {
                        System.out.println("The result is " + f);
                    } else {
                        System.out.println("The result is " + e);
                    }
                } else if (e < f) {

                    if ((e % 6) == 0 && (f % 6) == 0) {
                        System.out.println("The result is " + e);
                    } else {
                        System.out.println("The result is " + f);

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        input m =new input();
        m.input();
    }
}
