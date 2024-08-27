package LambdaExpressions;

@FunctionalInterface
interface MyLambda2
{
    // public void display(String str);

    public int add(int x , int y);
    
}


public class LambdaDemo2 {

    public static void main(String[] args)
    {

        // MyLambda2 m = (s)->  {  System.out.println(s);  };
        // m.display("Hello world");

        // MyLambda2 m = (a,b) -> { return a+b;};

        MyLambda2 m = (a,b) ->  a+b;

        int r = m.add(20, 30);
        System.out.println(r);
    }    
    
}
