package LambdaExpressions;

@FunctionalInterface
interface MyLambda
{
    public void display();
    
}

public class LambdaDemo1{

    public static void main(String[] args)
    {
        // MyLambda m = new MyLambda() {
        //     public void display()
        //     {
        //         System.out.println("Hello World");
        //     }
        // };

        MyLambda m = ()->  {  System.out.println("Hello World");  };

        m.display();
    }    
}