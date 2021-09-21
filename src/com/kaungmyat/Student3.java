package com.kaungmyat;
//Example of parameterized constructor
class Student3{
int id ;
String name;
    Student3 (int i,String n){ //s1 room_no 10 => id 12; name="Ko Myo"
        // s2 room_no 30 => id 3; name="Hla Hla"
        id = i;
        name = n;
    }
    public Student3() { // no 13 id=0; name=null; default constructor
        System.out.println("hello");
    }

    void display(){System.out.println(id+" "+name);}
public static void main(String args[]){  
//creating objects  
Student3 s1=new Student3(12,"Ko Myo");

Student3 s2=new Student3(3,"Hla Hla");
//displaying values of the object
    Student3 df_con=new Student3();
s1.display();
s2.display();
df_con.display();
}  
}
