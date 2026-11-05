package DOS_AND_DIS;
/**
 * 23. Develop a program to write PDT range values in those PD size memory bytes
 * ===================================================================================
 * 	1. Limitation of FOS and FIS
 *    -> they can write and read only 1 byte [0-255] range values
 *    -> can not write and read PDT size and range value
 *         byte, short, int, long, float, double char, boolean
 *         and String as 'one word and one line' at a time.
 *    -> to write and read PDT range values and one line at a time
 *         we must use DataOutputStream and DataInputStream classes
 *
 *   2. DOS and DIS can not write and read data directly from file
 *      we must use DOS and DIS connecting FOS and FIS
 *
 *   3. DOS and DIS are filter streams, just adding more functionality to
 *      FOS and FIS in writing and reading PDT and 1 line of data
 *
 *   4. We must create DOS and DIS objects as below
 *   	DOS dos = new DOS(new FOS(filename));
 *   	DIS dis = new DIS(new FIS(filename));
 *
 *   5. DOS class have below 9 methods
 *       for writing data in PDT range value, and one String
 *
 *   	public void writeByte(int b)
 *   	public void writeShort(int b)
 *   	public void writeInt(int b)
 *   	public void writeLong(long b)
 *   	public void writeFloat(float b)
 *   	public void writeDouble(double b)
 *   	public void writeChar(int b)
 *   	public void writeBoolean(boolean b)
 *
 *   	public void writeUTF(String b)
 *
 *   6. DIS class have below 10 methods
 *      for reading bytes in PDT size bytes, one String and one line
 *
 *   	public byte readByte()
 *   	public short readShort()
 *   	public int readInt()
 *   	public long readLong()
 *   	public float readFloat()
 *   	public double readDouble()
 *   	public char readChar()
 *   	public Boolean readBoolean()
 *
 *   	public String readUTF()
 *   	public String readLine()
 *
 *    Rule: We must call readXxx() methods in the same order writeXxx() methods were called
 *          else will get either wrong result or exception java.io.EOFException.
 *
 *  Below priogram explains writing PDT range values in PDT size bytes
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest1 {
    public static void main(String[] args) throws IOException {

        DataOutputStream dos = new DataOutputStream(
                        new FileOutputStream("abc.txt"));

        dos.writeByte(97);
        dos.writeByte(-97);
        dos.writeShort(98);
        dos.writeInt(99);
        dos.writeLong(100);
        dos.writeFloat(101);
        dos.writeDouble(102);
        dos.writeChar(103);
        dos.writeBoolean(true);
        dos.writeUTF("Hari");

        System.out.println("data is saved");

        dos.close();
    }
}