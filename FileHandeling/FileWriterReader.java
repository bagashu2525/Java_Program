package FileHandeling;

import java.io.*;
import java.util.Scanner;
public class FileWriterReader {
    public static void main(String[] args){
        try{
            File f1 = new File("file.txt");
            if(f1.createNewFile()){
                System.out.println("New file created");
            }
            else{
                System.out.println("File Already exist");
            }
            FileWriter writer = new FileWriter("file.txt");
            String s = "Hello world";
            writer.write(s);
            writer.close();

            File f2 = new File("myFile.TXT");
            Scanner sc = new Scanner(f2);
            System.out.println("The file content is:");
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();

        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
}
