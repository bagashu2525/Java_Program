package FileHandeling;

import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccessFileExample {  
    static final String FILEPATH ="myFile.TXT";  
    public static void main(String[] args) {  
        try {  
            System.out.println(new String(readFromFile("File2.txt", 0, 18)));  
            writeToFile("File2.txt", "I love my country and my people", 0);  
            writeToFile("File2.txt", "I love myself and my people", 20);
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  
