package JavaIOStreams;

import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\MyJava\\Student1.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();

        // FileInputStream fis = new FileInputStream("C:\\MyJava\\Student1.txt");
        // BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        // Student s=new Student();

        // s.rollno=Integer.parseInt(br.readLine());
        // s.name=br.readLine();
        // s.dept=br.readLine();

        // System.err.println(s.rollno + s.name + s.dept);

        // br.close();
        // fis.close();
        
    }    
}