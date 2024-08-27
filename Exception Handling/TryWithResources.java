
import java.io.*;
import java.util.*;

public class TryWithResources 
{
    
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("D:\\OOP\\Exception Handling\\Test.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) 
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
    }
}
