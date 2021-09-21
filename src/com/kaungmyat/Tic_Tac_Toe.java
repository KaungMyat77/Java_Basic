package com.kaungmyat;
import java.util.Scanner;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Display dis = new Display();
        Input1 in1 = new Input1();
        Input2 in2 = new Input2();
        Winner win = new Winner();
        try {
            while (true) {
                dis.display1();
                dis.gameboard();
                in1.input1_CheckNumber();

                if (win.winner()) {
                    dis.gameboard();
                    System.out.println("***************\nWinner is A\nThe game is finished");
                    dis.display2();
                }
                dis.gameboard();
                in2.input2_checkNumber();
                in2.history();
                if (win.winner()) {
                    dis.gameboard();
                    System.out.println("*****************\nWinner is B\nThe game is finished");
                    dis.display2();
                }
            }

        } catch (Exception E) {
            System.out.println("You have entered a string");
        }
    }
}

    class Display extends Input1 {
        void gameboard() {
            System.out.println("---------------------");
            System.out.println("|  " + a + "  |  " + b + "   |  " + c + "  |");
            System.out.println("---------------------");
            System.out.println("|  " + d + "  |  " + e + "   |  " + f + "  |");
            System.out.println("---------------------");
            System.out.println("|  " + g + "  |  " + h + "   |  " + i + "  |");
            System.out.println("---------------------");

        }
        void display1(){
            System.out.println("Welcome to Tic_Tac_Toe");
        }
        void display2(){

            Scanner scan = new Scanner(System.in);
            System.out.println("If want to exist the game; type Enter\n");//If you want to restart,type Restare");
            String EE = scan.nextLine();
            if(EE=="Exist"){
            System.exit(0);}
            //else if (EE=="Restart"){
            }
        }




    class Winner extends Input1 {
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
    }

     class Input1 {
        static byte a = 1;
        static byte b = 2;
        static byte c = 3;
        static byte d = 4;
        static byte e = 5;
        static byte f = 6;
        static byte g = 7;
        static byte h = 8;
        static byte i = 9;
        String A;
        byte a1;
        String history1;
        void input1_CheckNumber() {

            while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your Number between 1-9\nTurn A");
            byte numberA = scan.nextByte();
            A = Byte.toString(numberA);
            history1 = history1 + A;
            a1 = numberA;
            System.out.println(numberA);
            if (a1 <= 0 || a1 > 9) {
                System.out.println("You have enter wrong number");
            }break;
            }
                switch (a1) {
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


         class Input2 extends Input1 {
            String B;
            byte b1;
            String history2;
            String Fhistory;
            void input2_checkNumber() {
                while(true) {
                    System.out.println("Enter your Number between 1-9\nTurn B");
                    Scanner scan = new Scanner(System.in);
                    byte numberB = scan.nextByte();
                    b1 = numberB;
                    B = Byte.toString(numberB);
                    history2 = history2 + B;
                    //b1 = numberB;
                    System.out.println(numberB);

                    if (b1 <= 0 || b1 > 9) {
                        System.out.println("You have enter wrong number");
                    }break;
                }
                    switch (b1) {
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

            void history(){
                while(true) {

                    //history2 = history2 + B;
                    Fhistory = Fhistory+ history1+history2;
                    if (Fhistory.contains(history1)) {
                        System.out.println("The value is already contain");
                    }else if(Fhistory.contains(history2)) {
                        System.out.println("The value is already contain");
                    }else{
                        System.out.println("Ok next turn");
                    }break;
                }

            }
        }























