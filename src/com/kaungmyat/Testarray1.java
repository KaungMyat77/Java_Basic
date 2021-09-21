package com.kaungmyat;
import java.util.Arrays;
import java.util.Scanner;
//Single array
class Testarray1 {
    public static void main(String args[]) {
        String[] a = {"Ko Ko", "Ma Ma", "Kyaw Kyaw", "Myo Myo"};//declaration, instantiation and initialization
//printing array  
        for (int i = 0; i < a.length; i++) {//length is the property of array
            System.out.print("{" + a[i] + "}");
        }
        System.out.println(" ");

        //for each loop for Array only
        float[] b = {1.23F, 1.45F, 2.34F, 5.64F};
        for (float i : b) {
            System.out.println(i);
        }

        double[] c = {1.23F, 1, 2.34F, 5};
        for (double i : c
        ) {
            System.out.println(i);
        }

        String[] d = {"Ko Ko", "Ma Ma", "Kyaw Kyaw", "Myo Myo"};
        Arrays.stream(d).forEach(System.out::println);
        for (String i:d
             ) {
            System.out.println(i);
        }

    }
}
    class Testarray2 {
        //creating a method which receives an array as a parameter
        static void min(int arr[]) {
            int min = arr[0];
            int max= arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i])
                    min = arr[i];

                if (max < arr[i])
                    max = arr[i];
            }

            System.out.println("Your Smallest Number : "+min);
            System.out.println("Your Largest Number : "+max);
        }


        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Array Size : ");
            byte no = sc.nextByte();
            int[] a = new int[no];
            System.out.println("Enter Here :");
            for (int i = 0; i < no; i++) {
                a[i]= sc.nextInt(); // In put User Data to array
            }

            Arrays.sort(a); // array method => sort
            for (int i:a
                 ) {
                System.out.println(Arrays.toString(a));
            }
            min(a);

        }
    }

    //Return Array
class TestReturnArray{
    //creating method which returns an array
    static int[] get(){
        int[] a={1,2,3,4,5};
        return a;
//        return new int[]{10,30,50,90,60};
    }

    public static void main(String args[]){
//calling method which returns an array
        int arr[]=get();
//printing the values of an array
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }}

class Testarray3{
    public static void main(String args[]){
//declaring and initializing 2D array
            //row col
        int arr[][]={
            //Column  0 1 2 Row
                /*0*/{1,2,3},
                /*1*/{2,4,5},
                /*2*/{4,4,5}

                     };
//printing 2D array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] multi= { {1,2,3},
                         {4,5,6}

        };
        System.out.println(multi[0][0]);
        System.out.println(multi[0][1]);
        System.out.println(multi[0][2]);
        System.out.println(multi[1][0]);
        System.out.println(multi[1][1]);
        System.out.println(multi[1][2]);

    }}

class TestArrayCopyDemo {
    public static void main(String[] args) {
        //declaring a source array
        char[] a = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        //declaring a destination array
        char[] copyTo = new char[50];
        //copying array using System.arraycopy() method
        //  Start point for first array index number  destPos:second array Start index number length: First array number of copy
        System.arraycopy(a, 2, copyTo, 25, a.length-2);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
    }

}
class CeilExample1
{
    public static void main(String[] args)
    {
        double x = 83.000001;
        double y=-94.99;
        // Input positive value, Output ceil value of x
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
    }
}
class FloorExample1
{
    public static void main(String[] args) {
        double x = 94.99;
        double y = -94.99;
        // Input positive value, Output floor value of x
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
//        int aa= 25;
//        if(aa>=1 && aa<=30){
//            int cc=aa*35;
//            System.out.println(cc +500);
//        }
//        else if(aa>=31 && aa<=50){
//            int bb= aa-30;
//            System.out.println((bb*50)+1000 +500);
//        }
//        else  if()
//    }

    }
}
class TwoDArrayInput{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 2D array Rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter 2D array Columns : ");
        int columns=sc.nextInt();

        System.out.println("Enter array elements : ");

        int[][] twoD =new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nData you entered : \n");
//        for(int []x:twoD){
//            for(int y:x){
//                System.out.print(y+"        ");
//            }
//            System.out.println();
//        }
        for(int a=0; a<rows;a++)
        {
            for(int b=0; b<columns;b++)
            {
                System.out.print(twoD[a][b]+"        ");
            }
            System.out.println();
        }

    }

}
