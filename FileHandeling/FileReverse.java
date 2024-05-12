package FileHandeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;


public class FileReverse {
    public static String reverse(String s){
        char ch;
        String newch="";
        for(int i = 0 ;i<s.length();i++){
            ch=s.charAt(i);
            newch = ch + newch;
        }
        return newch;
    }
    public static void WriteToFile(String file,String newch,int position) throws FileNotFoundException,IOException{
        RandomAccessFile f1 = new RandomAccessFile(file,"rw");
        f1.seek(position);
        f1.write(newch.getBytes());
        f1.close();
        
    }
    public static void main(String[] args) throws IOException{
        //file creation
        File f1 = new File("File1.txt");
        //f1.createNewFile();

        //file write
        // FileWriter out = new FileWriter(f1);
        // out.write("hello world");
        // out.close();

        //file read using scanner class
        Scanner in = new Scanner(f1);
        System.err.println("The file1 content is : ");
        while(in.hasNextLine()){
            String s = in.nextLine();
            System.out.println(s);
        }
        in.close();

        //reversing word by word
        String newch="";
        in = new Scanner(f1);
        while(in.hasNextLine()){
            String s = in.nextLine();
            newch=reverse(s);
            //newch=newch+" "+reverse(s);
        }
        System.out.println(newch);
        in.close();

        WriteToFile("File2.TXT",newch,18);

    }

}
