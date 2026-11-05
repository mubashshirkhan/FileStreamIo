package BufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

//		String line = br.readLine();
//		System.out.println(line);
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());

        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line+"\n");
        }



    }
}
