package FileHandeling;

import java.io.File;
import java.io.IOException;

public class FileInfo { 
    public static void main(String[] args){
        //creating a file
        try{
            File f0 = new File("File.txt");
            if(f0.createNewFile()){
                System.out.println("File: "+f0.getName());
                System.out.println("The absolute path: "+f0.getAbsolutePath());
                System.out.println("File can be write? "+f0.canWrite());
                System.out.println("File can be read? "+f0.canRead());
                System.out.println("File size: "+f0.length());

            }else{
                System.out.println("The file is already exist");
                System.out.println("File: "+f0.getName());
                System.out.println("The absolute path: "+f0.getAbsolutePath());
                System.out.println("File can be write? "+f0.canWrite());
                System.out.println("File can be read? "+f0.canRead());
                System.out.println("File size: "+f0.length());

                //delete file
                if(f0.delete()){
                    System.out.println("The file "+f0.getName() +" has been deleted");
                }
                else{
                    System.out.println("Unexpected error occur");
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    

}
