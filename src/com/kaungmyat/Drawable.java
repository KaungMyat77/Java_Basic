package com.kaungmyat;

//Interface declaration: by first user
interface Drawable1{
void draw();  
}  
//Implementation: by second user  
class Rectangle1 implements Drawable1{
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 implements Drawable1{
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class TestInterface1{
public static void main(String args[]){
Drawable1 d=new Circle1();//In real scenario, object is provided by method e.g. getDrawable()
d.draw();  
}}
interface printable{
    void print();
}
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
interface Showable1{
    void show();

    interface Message1{
        void msg();
    }
}
interface aa extends Showable1{
    default void show(){
        System.out.println("Hello");
    }
}
class TestNestedInterface1 implements Showable1.Message1,Showable1,aa{
    public void show(){
        System.out.println("Min ga Lar Bar");
    }
    public void msg(){System.out.println("Hello nested interface");}

    public static void main(String args[]){
        Showable1.Message1 message=new TestNestedInterface1();//upcasting here
        message.msg();
       Showable1 s= new TestNestedInterface1();
       s.show();
    }
}
