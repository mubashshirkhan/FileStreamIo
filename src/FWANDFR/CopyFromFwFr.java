package FWANDFR;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFromFwFr {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("cbk.txt");
        FileReader fr = new FileReader("cbc.txt");

        int data;
        while ((data = fr.read()) != -1) {
            fw.write(data);
        }
        fw.flush();

        System.out.println("File copied..");
        fw.close();
        fr.close();
    }
}
