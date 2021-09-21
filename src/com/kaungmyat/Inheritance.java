package com.kaungmyat;

public class Inheritance {
}
//1.Single
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal1 {
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        Dog1 d=new Dog1();
        d.bark();
        d.eat();
    }}

// 2.Multilevel
class Animal1 {
    void eat(){System.out.println("eating...");}
}
class Dog1 extends Animal1 {
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog1 {
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}
//3 Hierarchical
class Animal2{ // A
    void eat(){System.out.println("eating...");}
}
class Dog2 extends Animal2{ // B
    void bark(){System.out.println("barking...");}
}
class Cat2 extends Animal2{ // C
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat2 c=new Cat2();
        c.meow();
        c.eat();
        Dog2 d2=new Dog2();
        d2.bark();
        d2.eat();

    }}
// 4. Multiple Java is not support Multiple inheritance.
//You get Compile Time Error.

//5. Hybird is not in java but We can make similar.