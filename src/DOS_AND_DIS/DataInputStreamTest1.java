package DOS_AND_DIS;

/**
 * 24. Develop a program to read PDT size bytes, String and one line at time
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest1 {
    public static void main(String[] args) throws IOException {

        DataInputStream dis = new DataInputStream(new FileInputStream("abc.txt"));

        System.out.println( dis.readByte());
        System.out.println( dis.readByte());
        System.out.println( dis.readShort());
        System.out.println( dis.readInt());
        System.out.println( dis.readLong());
        System.out.println( dis.readFloat());
        System.out.println( dis.readDouble());
        System.out.println( dis.readChar());
        System.out.println( dis.readBoolean());
        System.out.println( dis.readUTF());

        dis.close();
    }

}

/*
	Test case: Change the order of readXxx() method calling
	to experience the wrong values and EOFException
*/