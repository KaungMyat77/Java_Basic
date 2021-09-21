package com.kaungmyat;
import java.util.Scanner;

public class Tic_Tac_New extends Ui_Display{
    public static void main(String[] args) {
        showUsData();
    }
}

class Ui_Display {
    static String history="";
    static String usData1,usData2;
    static String a="1",b="2",c="3",d="4",e="5",f="6",g="7",h="8",i="9";
    static void gameboard() {
        System.out.println("---------------------");
        System.out.println("|  " + a + "  |  " + b + "   |  " + c + "  |");
        System.out.println("---------------------");
        System.out.println("|  " + d + "  |  " + e + "   |  " + f + "  |");
        System.out.println("---------------------");
        System.out.println("|  " + g + "  |  " + h + "   |  " + i + "  |");
        System.out.println("---------------------");
    }
    static void showUsData(){
        while (true){
            gameboard();
            UserInput us=new UserInput();
            us.userInput1();
            if(chUserData1()){
                gameboard();
                if(!winner()) {
                    us.userInput2();
                    if (chUserData2()) {
                        if (winner()) {
                            System.out.println("winner");
                            break;
                        }
                    } else {
                        System.out.println("Error In check userdata2 function ");
                    }
                }else{
                    System.out.println("Winner First Player");
                    break;
                }
            }else {
                System.out.println("Error In check userdata1 function ");
            }
        }
    }


    static boolean chUserData1(){
        if(usData1.equals("1") ) {
            a = "#";
            return true;
        }else if(usData1.equals("2") ){
            b="#";
            return true;
        }else if(usData1.equals("3") ){
            c="#";
            return true;
        }else if(usData1.equals("4") ){
            d="#";
            return true;
        }else if(usData1.equals("5") ){
            e="#";
            return true;
        }else if(usData1.equals("6") ){
            f="#";
            return true;
        }else if(usData1.equals("7") ){
            g="#";
            return true;
        }else if(usData1.equals("8") ){
            h="#";
            return true;
        }else if(usData1.equals("9") ){
            i="#";
            return true;
        }else{
            return false;
        }
    }
    static boolean chUserData2(){
        if(usData2.equals("1") ) {
            a = "&";
            return true;
        }else if(usData2.equals("2") ){
            b="&";
            return true;
        }else if(usData2.equals("3") ){
            c="&";
            return true;
        }else if(usData2.equals("4") ){
            d="&";
            return true;
        }else if(usData2.equals("5") ){
            e="&";
            return true;
        }else if(usData2.equals("6") ){
            f="&";
            return true;
        }else if(usData2.equals("7") ){
            g="&";
            return true;
        }else if(usData2.equals("8") ){
            h="&";
            return true;
        }else if(usData2.equals("9") ){
            i="&";
            return true;
        }else{
            return false;
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
}

class UserInput extends  Ui_Display {
    Scanner sc = new Scanner(System.in);
//    InError_Check er = new InError_Check();

    void userInput1() {
        System.out.println("------------------First Person Turn------------------");
        while (true) {
            System.out.print("Enter Choose Number: ");
            String usData = sc.nextLine();
            if (Main.isNumeric(usData)) {
                byte chdata=Byte.parseByte(usData);
                if(chdata<=0 || chdata >=10 ){
                    System.out.println("Please Choose 1 to 9.Choose Careful!");
                    continue;
                }else {
                    if (User_History.isHistory(history, usData)) {
                        System.out.println("Number is already choosed: Choose Careful!");
                        continue;
                    } else {
                        history = history + usData;
                        usData1 = usData;
                        break;
                    }
                }
            } else {
                System.out.println("Cannot Enter String.Please Enter Carefully.");
                continue;
            }
        }
    }
    void userInput2() {
        System.out.println("------------------Second Person Turn------------------");
        while (true) {
            System.out.print("Enter Choose Number: ");
            String usData = sc.nextLine();
            if (Main.isNumeric(usData)) {
                byte chdata=Byte.parseByte(usData);
                if(chdata<=0 || chdata >=10 ){
                    System.out.println("Please Choose 1 to 9.Choose Careful!");
                    continue;
                }else {
                    if (User_History.isHistory(history, usData)) {
                        System.out.println("Number is already choosed: Choose Carefully!");
                        continue;
                    } else {
                        history = history + usData;
                        usData2 = usData;
                        break;
                    }
                }
            } else {
                System.out.println("Cannot Enter String.Please Enter Carefully.");
                continue;
            }
        }
    }
}

//class InError_Check {
//    boolean isNumeric(String strNum) {
//        if (strNum == null) {
//            return false;
//        }
//        try {
//            byte d = Byte.parseByte(strNum);
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//        return true;
//    }
//}
