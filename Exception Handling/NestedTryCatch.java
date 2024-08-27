public class NestedTryCatch {
    public static void main(String[] args)
    {
        int A[] = {30,20,10,0,3};

        try
        {
           try
           {
                int c = A[0]/A[3];
                System.out.println("Division is " + c);
           } 

           catch(ArithmeticException e)
           {
                System.out.println("Denominator should not be 0");
           }

           System.out.println(A[2]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalide Array index");
        }

        System.out.println("Bye");
    }
}
