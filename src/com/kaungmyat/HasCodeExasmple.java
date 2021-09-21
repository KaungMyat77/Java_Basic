package com.kaungmyat;

import javax.swing.*;

public class HasCodeExasmple {

    static class Calculation{
        void fact(int  n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println("factorial is "+fact);
        }
        void even(int a){
            int b=a;
            if(b % 2 == 0){
                System.out.println("even");
            }
            else
            System.out.println("odd");
        }

        public static void main(String args[]){

        }
    }

}
