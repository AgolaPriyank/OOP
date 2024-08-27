package JavaIOStreams;
import java.io.*;
import java.io.FileReader;

public class FileInputStreams {
    
    
    public FileInputStreams(String string) {
        //TODO Auto-generated constructor stub
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        try (FileReader fr = new FileReader("D:/OOP/Test.txt"))
        {
            int x;
            while ((x = fr.read()) != -1 ) {
                
                System.out.print((char)x);
            }
        }
    } 
}
