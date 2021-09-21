package com.kaungmyat;

import java.util.Scanner;

public class Ticc {
    static byte a = 1;
    static byte b = 2;
    static byte c = 3;
    static byte d = 4;
    static byte e = 5;
    static byte f = 6;
    static byte g = 7;
    static byte h = 8;
    static byte i = 9;


    static void gameBoard() {
        System.out.println("-------------------");
        System.out.println(" " + a + "  |  " + b + "   |  " + c + "  |");
        System.out.println("-------------------");
        System.out.println(" " + d + "  |  " + e + "   |  " + f + "  |");
        System.out.println("-------------------");
        System.out.println(" " + g + "  |  " + h + "   |  " + i + "  |");
        System.out.println("-------------------");
    }


    static void input_A() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number between 1-9\nTurn A : ");
        int numberA = scan.nextByte();
//        System.out.println(numberA);

        if (numberA <= 0 || numberA > 9) {
            System.out.println("You have enter wrong number");
        } else {
            switch (numberA) {
                case 1:
                    a = 0;
                    break;
                case 2:
                    b = 0;
                    break;
                case 3:
                    c = 0;
                    break;
                case 4:
                    d = 0;
                    break;
                case 5:
                    e = 0;
                    break;
                case 6:
                    f = 0;
                    break;
                case 7:
                    g = 0;
                    break;
                case 8:
                    h = 0;
                    break;
                case 9:
                    i = 0;
                    break;
            }
        }
    }


    static void input_B() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number between 1-9\nTurn B : ");
        int numberB = scan.nextByte();
        System.out.println(numberB);
        if (numberB <= 0 || numberB > 9) {
            System.out.println("You have enter wrong number");

        }
         else {
            switch (numberB) {
                case 1:
                    a = 9;
                    break;
                case 2:
                    b = 9;
                    break;
                case 3:
                    c = 9;
                    break;
                case 4:
                    d = 9;
                    break;
                case 5:
                    e = 9;
                    break;
                case 6:
                    f = 9;
                    break;
                case 7:
                    g = 9;
                    break;
                case 8:
                    h = 9;
                    break;
                case 9:
                    i = 9;
                    break;
            }
            }
        }



    static boolean winner() {
        if (a == b && b == c) {
            return true;
        } else if (d == e && e == f) {
            return true;
        } else if (g == h && h == i) {
            return true;
        } else if (a == d && d == g) {
            return true;
        } else if (b == e && e == h) {
            return true;
        } else if (c == f && f == i) {
            return true;
        } else if (a == e && e == i) {
            return true;
        } else if (c == e && e == g) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            while (true) {
                gameBoard();
                input_A();
                gameBoard();
                if (winner()) {
                    gameBoard();
                    System.out.println("**************");
                    System.out.println("Winner is A");
                    System.out.println("The game is finished");
                    break;
                }
                input_B();
                gameBoard();
                if (winner()) {
                    gameBoard();
                    System.out.println("************");
                    System.out.println("Winner is B");
                    System.out.println("The game is finished");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("You have entered a string ");
        }
    }
}



