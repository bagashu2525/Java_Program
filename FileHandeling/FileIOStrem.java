package FileHandeling;

import java.io.*;
public class FileIOStrem {
    public static void main(String[] args){
        try{
            // FileInputStream fin = new FileInputStream("File1.txt");
            // int i =0;
            // while((i=fin.read())!=-1){
            //     System.out.print((char)i);
            // }
            // fin.close();

            FileOutputStream fout = new FileOutputStream("File2.txt");
            String s = "This is a new line.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();

            FileInputStream fin = new FileInputStream("File2.txt");
            int i = 0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
