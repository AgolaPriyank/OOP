package LambdaExpressions;

interface MyLambda4
{
    // public void display(String str1 , String str2);

    public int display(String str1 , String str2);
}



public class LambdaDemo4 {

    // public static void revarce(String str)
    // {
    //     StringBuffer sb = new StringBuffer(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }



    // public  void revarce(String str)
    // {
    //     StringBuffer sb = new StringBuffer(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }



    public LambdaDemo4(String s)
    {
        System.out.println(s.toUpperCase());
    }

    
    public static void main(String[] args)
    {

            // MyLambda4 ml = System.out :: println;
            // ml.display("Hello");

            // MyLambda4 ml = LambdaDemo4 :: revarce;
            // ml.display("Hello");

            // LambdaDemo4 ld = new LambdaDemo4();
            // MyLambda4 ml = ld :: revarce;
            // ml.display("Hello");

            // MyLambda4 ml = LambdaDemo4 :: new;
            // ml.display("hello");

            MyLambda4 ml = String :: compareTo;
            System.out.println(ml.display("hello", "hello"));


    }
}
