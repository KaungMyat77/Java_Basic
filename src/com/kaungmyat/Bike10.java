package com.kaungmyat;

class Bike10{
  final int speedlimit;//blank final variable
    //constructor
//  Bike10(){
//  speedlimit=70;
//  System.out.println(speedlimit);
//  }
  //instance block
{speedlimit=70;
}
  
  public static void main(String args[]){  
    Bike10 b=new Bike10();
    System.out.println(b.speedlimit);

 }  
}
class Bike11{
  int n;
  void cube(final int n){
    this.n=n;
//    n=n+2;//can't be changed as n is final
//    n*n*n;
  }
  public static void main(String args[]){
    Bike11 b=new Bike11();
    b.cube(5);
    System.out.println(b.n);
  }
}