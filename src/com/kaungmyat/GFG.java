package com.kaungmyat;

//class GFG {
//
//    public static void main(String args[])
//    {
//        // Creating an array of objects
//        // declared with initial values
//        int a=10;
//        Object[] aa
//            = { "Maruti",2019, "Suzuki",
//                2019,'c', a};
//
//      // Printing the values
////        System.out.println(javaObjectArray[0]);
////        System.out.println(javaObjectArray[1]);
////        System.out.println(javaObjectArray[2]);
////        System.out.println(javaObjectArray[3]);
//        for (int i=0; i<aa.length;i++){
//            System.out.println(aa[i]);
//    }
//    }
//}
// Java program to demonstrate initializing
// an array of objects using constructor

import java.util.regex.Pattern;

class GFG {

    public static void main(String args[])
    {

        // Declaring an array of student
        Student_tt[] arr= new Student_tt[2];;

        // Allocating memory for 2 objects
        // of type student

        // Initializing the first element
        // of the array
        arr[0] = new Student_tt(1701289270, "Satyabrata",'A');

        // Initializing the second element
        // of the array
        arr[1] = new Student_tt(1701289219, "Omm Prasad",'C');

        // Displaying the student data
        System.out.println(
                "Student data in student arr 0: ");
        arr[0].display();

        System.out.println(
                "Student data in student arr 1: ");
        arr[1].display();
    }
}

// Creating a student class with
// id and name as a attributes
class Student_tt {

    public int id;
    public String name;
    public char fev;

    // Student class constructor
    Student_tt(int id, String name,char fev)
    {
        this.id = id;
        this.name = name;
        this.fev=fev;
    }

    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student id is: " + id + " "
                + "and Student name is: "
                + name+"\t" +
                "favourite Charter " + fev);
        System.out.println();
    }
}
class RegexExample7{
    public static void main(String args[]){
//        System.out.println("by character classes and quantifiers ...");
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
//        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
//
//        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
//
//        System.out.println("by metacharacters ...");
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
        System.out.println(Pattern.matches("[0][9][7][9876][0-9]{7}","09772456781"));
        System.out.println(Pattern.matches("[0][9][9][76]\\d{7}","09972456781"));
    }}
