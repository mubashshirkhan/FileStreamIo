package FOSANDFIS;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("abc.txt");
//
//
//        int data1 = fis.read();
//        int data2 = fis.read();
//        int data3 = fis.read();
//        int data4 = fis.read();
//        int data5 = fis.read();
//        int data6 = fis.read();
//        int data7 = fis.read();
//
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);
//        System.out.println(data4);
//        System.out.println(data5);
//        System.out.println(data6);
//        System.out.println(data7);
//
//        System.out.println((char) data1);
//        System.out.println((char) data2);
//        System.out.println((char) data3);
//        System.out.println((char) data4);
//        System.out.println((char) data5);
//        System.out.println((char) data6);
//        System.out.println((char) data7);

        int data;
        while ((data = fis.read()) != -1) {
            System.out.println(data +"\t "+ (char) data);
        }

        fis.close();
    }
}
