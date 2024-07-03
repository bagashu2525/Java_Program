package FileHandeling;

import java.io.*;
public class RecentFile {
    public static void main(String[] args){
        String directoryPath = "FileHandeling";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if(files!=null){
            for(File file: files){
                if((System.currentTimeMillis()-file.lastModified())<=(10*60*1000)){
                    System.err.println(file.getName());
                }
            }
        }
        
    }
}
