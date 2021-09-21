package com.kaungmyat;

import java.util.Scanner;

public class TTT_Game extends Calcu {
    public static void main(String[] args) {
        System.out.println("--------- Welcome to Tic_Tac_Toe ------------");
        calcu();
    }
}

class U_Display extends Calcu{
    static void gameboard() {
        System.out.println("---------------------");
        System.out.println("|  " + a + "  |  " + b + "   |  " + c + "  |");
        System.out.println("---------------------");
        System.out.println("|  " + d + "  |  " + e + "   |  " + f + "  |");
        System.out.println("---------------------");
        System.out.println("|  " + g + "  |  " + h + "   |  " + i + "  |");
        System.out.println("---------------------");
    }

}
class Calcu{
    static String History="";
    static String urData1,urData2;
    static String a="1",b="2",c="3",d="4",e="5",f="6",g="7",h="8",i="9";
    static void calcu(){
        U_Display ud=new U_Display();
        Input_Data us=new Input_Data();
        while (true) {
            ud.gameboard();
            us.usData1();
            if (chDaw()) {
                ud.gameboard();
                System.out.println("The Game Draw");
                break;
            } else {
//            System.out.println(winner()+"User 1 win check");
                if (winner()) {
                    ud.gameboard();
                    System.out.println("First Person is Winner");
                    break;
                } else {
                    ud.gameboard();
                    us.usData2();
                    if(chDaw()){
                        ud.gameboard();
                        System.out.println("The Game Draw");
                        break;
                    }else {
//                System.out.println(winner()+"User 2 win check");
                        if (winner()) {
                            ud.gameboard();
                            System.out.println("Second Person is Winner.");
                            break;
                        } else {
                            continue;
                        }
                    }
                }
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
        }else{
            return false;
        }
    }
    static byte count=0;
    static void draw(){
        if(a.equals("*") || a.equals("#")){
            count++;
        }else if (b.equals("*") || b.equals("#")){
            count++;
        }else if (c.equals("*") || c.equals("#")){
            count++;
        }else if (d.equals("*") || d.equals("#")){
            count++;
        }else if (e.equals("*") || e.equals("#")){
            count++;
        }else if (f.equals("*") || f.equals("#")){
            count++;
        }else if (g.equals("*") || g.equals("#")){
            count++;
        }else if (h.equals("*") || h.equals("#")){
            count++;
        }else if (i.equals("*") || i.equals("#")){
            count++;
        }else {
            count =0;
        }
    }
    static boolean chDaw(){
        draw();
        if(count==9){
            return true;
        }else {
            return false;
        }
    }
}

class Input_Data extends Calcu {
    Scanner sc = new Scanner(System.in);

    void usData1() {
        while (true) {
            System.out.println("------------------First Person Turn------------------");
            System.out.print("Enter Choose Number: ");
            String uData1 = sc.nextLine();
            if (Main.isNumeric(uData1)) {
                byte chdata = Byte.parseByte(uData1);
                if (chdata >= 1 && chdata <= 9) {
                    if (User_History.isHistory(History, uData1)) {
                        System.out.println("Number is already choosed: Choose Carefully!");
                    } else {
                        History = History + uData1;
                        urData1 = uData1;
//                        System.out.println(urData1);
                        Ch_Us_Data ch=new Ch_Us_Data();
                        ch.ch_us_data(uData1);
                        break;
                    }

                } else {
                    System.out.println("Please Choose 1 to 9.Choose Careful!");
                }
            } else {
                System.out.println("Cannot Enter String.Please Enter Carefully.");
            }
        }

    }

    void usData2() {
        while (true) {
            System.out.println("------------------Second Person Turn------------------");
            System.out.print("Enter Choose Number: ");
            String uData2 = sc.nextLine();
            if (Main.isNumeric(uData2)) {
                byte chdata = Byte.parseByte(uData2);
                if (chdata >= 1 && chdata <= 9) {
                    if (User_History.isHistory(History, uData2)) {
                        System.out.println("Number is already choosed: Choose Carefully!");
                    } else {
                        History = History + uData2;
                        urData2 = uData2;
//                        System.out.println(urData2);
                        Ch_Us_Data ch=new Ch_Us_Data();
                        ch.ch_us_data(uData2);
                        break;
                    }
                } else {
                    System.out.println("Please Choose 1 to 9.Choose Careful!");
                }
            } else {
                System.out.println("Cannot Enter String.Please Enter Carefully.");
            }
        }

    }
}
class Ch_Us_Data extends Calcu{
        void ch_us_data(String aa) {
            if (urData1.equals(aa)) {
                switch (aa) {
                    case "1":
                        a = "#";
                        break;
                    case "2":
                        b = "#";
                        break;
                    case "3":
                        c = "#";
                        break;
                    case "4":
                        d = "#";
                        break;
                    case "5":
                        e = "#";
                        break;
                    case "6":
                        f = "#";
                        break;
                    case "7":
                        g = "#";
                        break;
                    case "8":
                        h = "#";
                        break;
                    case "9":
                        i = "#";
                        break;
                }
            }else{
                switch (aa) {
                    case "1":
                        a = "&";
                        break;
                    case "2":
                        b = "&";
                        break;
                    case "3":
                        c = "&";
                        break;
                    case "4":
                        d = "&";
                        break;
                    case "5":
                        e = "&";
                        break;
                    case "6":
                        f = "&";
                        break;
                    case "7":
                        g = "&";
                        break;
                    case "8":
                        h = "&";
                        break;
                    case "9":
                        i = "&";
                        break;
                }
            }

        }
}


