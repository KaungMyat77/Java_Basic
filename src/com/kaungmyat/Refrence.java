package com.kaungmyat;

import java.awt.*;

public class Refrence {
    public static void main(String[] args) {
        Point point1 = new Point( 2,1);
                                //100  200
        //x,y is parameter
        Point point2=point1;
        point1.x=2; point1.y=2;
        System.out.println(point1);
        System.out.println(point2);

    }


}
