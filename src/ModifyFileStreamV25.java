import java.io.*;

public class ModifyFileStreamV25 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("abc.txt");

        String allLines = fr.readAllAsString();

        System.out.println(allLines);

    }
}
