package FOSANDFIS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("bbc.txt");

        int data;

        while((data = fis.read())!=-1){
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
