package FWANDFR;

import java.io.FileReader;
import java.io.IOException;
/*
26. Develop a program to read data from a file by using FR
*/
public class FleReaderTest1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("cbc.txt");

        int data;
        while((data = fr.read()) != -1) {
            System.out.println(data+ "\t"+(char)data);
        }
    }
}