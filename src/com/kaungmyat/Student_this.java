package com.kaungmyat;

class Student_this{
int rollno;  
String name;  
float fee;  
Student_this(int rollno,String name,float fee){
rollno=rollno; //test no include this.
this.name=name;
this.fee=fee;
    System.out.println(rollno+" " + name+" " + fee);
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1{  
public static void main(String args[]){  
Student_this s1=new Student_this(111,"ankit",5000f);
Student_this s2=new Student_this(112,"sumit",6000f);
s1.display();  
s2.display();

}}

class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }}

class A1{
    A1(){System.out.println("hello a");}
    A1(int x){
        this();//default constructor
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        A1 a=new A1(10);
    }}

class Student1 {
    int rollno;
    String name,course;
    float fee;
    Student1(int rollno, String name, String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student1(int rollno, String name, String course, float fee){
        this.fee=fee;
        this.name=name;
        this.course=course;
        this.rollno=rollno;
//        this(rollno,name,course);//C.T.Error
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis8{
    public static void main(String args[]){
        Student1 s1=new Student1(111,"ankit","java");
        Student1 s2=new Student1(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}
class S2{
    S2(int a){
        System.out.println(a);
    }
    void m(S2 obj){
        System.out.println(obj);
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2(1);
        s1.p();
    }
}
//class B{
//    int a;
//    B(int a){
//        this.a=a;
//    }
//    void display(){
//        System.out.println(a);//using data member of A4 class
//    }
//}
//
//class A4{
//    A4(int a){
//        B b=new B(a);
//        b.display();
//    }
//    public static void main(String args[]){
//        A4 a=new A4(10);
//    }
//}
class B{
    A4 obj;
    B(A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }
}

class A4{
    int data=10;
    A4(){
        B b=new B(this);
        b.display();
    }
    public static void main(String args[]){
        A4 a=new A4();
    }
}
