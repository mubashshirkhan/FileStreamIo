package BufferedReaderClass;

import java.io.*;

public class CopyBufferedReader {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("kbc.txt");
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

//        String data;
//        while((data = br.readLine() )!= null){
//            fw.write(data+"\n");//very imp
//        }

        while(br.ready()){
            fw.write(br.readLine()+"\n");
        }

        fw.flush();
        System.out.println("data copied..");
    }
}
