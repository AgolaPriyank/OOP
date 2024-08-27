package CollectionFramework;
import java.util.*;

import JavaIOStreams.FileOutPutStream;

import java.io.*;

public class PropertiesDemo {
 
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();

        // p.setProperty("Brand" ,"Dell" );
        // p.setProperty("Processor","i7" );
        // p.setProperty("OS","Windows10" );
        // p.setProperty("Model","Latitued" );

        

        //  p.store(new FileOutPutStream("MyData.txt"), "Laptop");

        // p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");
        
        
        // p.load(new FileInputStream("MyData.txt"));


        p.loadFromXML(new FileInputStream("MyData.xml"));

         System.out.println(p.getProperty("Brand"));
    }
}
