package com.kaungmyat;

import com.kaungmyat.Main;

import java.util.Scanner;

public class Exercise_One {

}

    class Common_Dighit {

        static class Input {
            static String A;
            static String B;
            static char E;
            static char F;
            static char G;
            static char H;
            static int I;
            static int J;

            void input() {
                while (true) {
                    display1();
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter your First Number : ");
                    String a = scan.next();
                    A=a;
                    if(Main.isNumeric(a)) {
                        if (bOrS(a)) {
                            System.out.println("Enter your Second Number : ");
                            String b = scan.next();
                            B = b;
                            if (Main.isNumeric(b)) {
                                if (bOrS(b)) {
                                    split();
                                    check_number();
                                     if (display2()) {
//                                         System.out.println("Enter IF");
                                     System.exit(0);
//                                    break;
                                      } else {
//                                         System.out.println("Enter Else");
                                     System.out.println("Start Again");
                                       }
                                } else {
                                    System.out.println("You have entered wrong number");
                                }
                            } else {
                                System.out.println("You Have entered a string");
                            }
                        }else {
                            System.out.println("You have entered wrong number");

                        }
                    }else {
                        System.out.println("You Have entered a string");

                    }
                }
            }


            static boolean bOrS(String aa) {
                I = Integer.parseInt(aa);
                if (I < 25 || I > 75 ) {
                    return false;}
                else {
                    return true;
                }

            }
            static void split() {
                char e = A.charAt(0);
                E = e;
                char f = A.charAt(1);
                F = f;
                char g = B.charAt(0);
                G = g;
                char h = B.charAt(1);
                H = h;
            }

            static void check_number() {
                if (E == G || E == H) {
                    System.out.println("There is common digit in both number");
                } else if (F == G || F == H) {
                    System.out.println("There is common digit in both number");
                } else {
                    System.out.println("There is no common number");
                }
            }

            void display1() {
                System.out.println("Choose number between 25 and 75");
            }

            boolean display2() {

                    System.out.println("If you want to exist enter exist\n----------------\nEnter to start again");

                    Scanner scan = new Scanner(System.in);
                    //System.out.println("If you want to exist enter exist\n----------------\nEnter to start again");
                    String s = scan.nextLine();
//                System.out.println(s + " s result");
//                System.out.println(s.equals("exist") + " s.equal");
                    if (s.equals("exist")) {
                        return true;
                    }else {
                        return false;
                    }

                    }
                }





        public static void main(String[] args) {
            Common_Dighit.Input k = new Common_Dighit.Input();
            k.input();
        }
    }









