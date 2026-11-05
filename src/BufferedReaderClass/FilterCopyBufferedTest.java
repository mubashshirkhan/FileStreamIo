package BufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterCopyBufferedTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("kbc.txt");
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


       while(br.ready()){
          if(br.readLine().contains("abc")){
              fw.write(br.readLine()+"\n");
          }
        }

       String line;
        while ((line = br.readLine()) != null) {
            if (line.contains("abc"))
                fw.write(line + "\n");
        }
        fw.flush();
        System.out.println("data copied..");
    }
}
