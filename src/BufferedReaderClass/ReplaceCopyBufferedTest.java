package BufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceCopyBufferedTest {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("kbc.txt");
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

        String line;
        while ((line = br.readLine()) != null) {

                fw.write(line.replace("abc","xyz") + "\n");
        }
        fw.flush();
        System.out.println("data copied..");

    }
}
