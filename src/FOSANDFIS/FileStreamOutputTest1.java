package FOSANDFIS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileStreamOutputTest1 {
    public static void main(String[] args) throws IOException {

        //FileOutputStream fos = new FileOutputStream("abc.txt",true);//append data until the prgram runs
        FileOutputStream fos = new FileOutputStream("abc.txt");

        //writing data
        fos.write(65);
        fos.write(97);
        fos.write('b');
        fos.write(150);
        fos.write(-50);
        fos.write(750);

        fos.write("Muabshshir".getBytes(StandardCharsets.UTF_8));
        fos.write("Khan".getBytes(StandardCharsets.UTF_8));

        System.out.println("data saved");

        fos.close();

    }
}
