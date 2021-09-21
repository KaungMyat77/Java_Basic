package com.kaungmyat;

import java.io.*;

//public class DataStreamExample {
//     public static void main(String args[]){
//          try{
//            FileInputStream fin=new FileInputStream("D:\\testout.txt");
//            int i=fin.read();
////              System.out.println(i);
//            System.out.print((char)i);
//
//            fin.close();
//          }catch(Exception e){System.out.println(e);}
//         }
//        }
//public class DataStreamExample {
//    public static void main(String args[]){
//        try{
//            FileInputStream fin=new FileInputStream("D:\\testout.txt");
//            int i=0;
//            while(    (i=fin.read())!=-1    )
//            {
//                System.out.print((char)i);
//            }
//            fin.close();
//        }catch(Exception e){System.out.println(e);}
//    }
//}
class WriteFile {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fo = new FileOutputStream("D:\\OutputFile.txt");
//        DataOutputStream dos = new DataOutputStream(fo);
//
//        String text = "This is an example of DataOutputStream";
//        byte[] b = text.getBytes();
//        int i = 100;
//        double d = 123.45;
//        float f = 45.5f;
//        boolean bl = true;
//
//        dos.writeUTF("Write Unicode");
//        dos.writeInt(i);
//        dos.writeChars("Write character");
//        dos.writeByte(75);
//        dos.writeLong(999999);
//        dos.writeBoolean(bl);
//        dos.writeFloat(f);
//        dos.writeDouble(d);
//        dos.writeChar('d');
//        String s="Welcome to New World.";
//        byte c[]=s.getBytes();//converting string into byte array
//        dos.write(c);
//        dos.writeChars(s);
//
//        System.out.println("Number of bytes written: " + dos.size());
//        System.out.println("Success");
//        dos.close();
        read();
    }

    static void read(){
        try {
            FileInputStream ft = new FileInputStream("D:\\OutputFile.dat");
            DataInputStream dis = new DataInputStream(ft);
            double d = dis.readDouble();
            float f = dis.readFloat();
            System.out.println(d+f);
            int i= dis.readInt();
            byte b= dis.readByte();
            System.out.println(i+b);

//            System.out.println(dis.available() + " Count Data");
//            int count = dis.available();
//            // Create byte array
//            byte[] j = new byte[count];
//            for (byte l:j
//                 ) {
//                System.out.print(l);
//            }
//            System.out.println();
//            // Read data into byte array
//            int bytes = dis.read(j);
//
//            // Print number of bytes
//            // actually read
//            System.out.println(bytes + "Bytes Data");
//
//            for (byte by : j) {
//                // Print the character
//                System.out.print((char)by);
//            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}