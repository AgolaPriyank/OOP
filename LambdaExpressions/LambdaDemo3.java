package LambdaExpressions;

interface MyLambda3
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda3 ml)
    {
        ml.display();
    }
}

class Demo
{
    public void mathod1()
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()-> {System.out.println("Hello");});
    }
}

// class Demo
// {
//     int z = 0;
    
//     public void mathod1()
//     {
//         int y = 0;
//         // y++;

//         MyLambda3 ml = () ->{
//             int x = 0;
//             x++;
//             System.out.println("Hello  "+ x);
//             System.out.println("Hiii  "+ y + "  " + z++);
//             x++;
//         };
//         z++;
        
//         ml.display();
//     }
// }

public class LambdaDemo3 {
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.mathod1();
    }
}
