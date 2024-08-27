class LowBalanceException extends Exception
{
    public String toString()
    {
        return "balance should not less than 5000";
    }
}

public class CheckedUnchecked {

    static void fun1()
    {
        // This is unchecked Exception therefor we not must implement the try and catch block as you wess then you implement it.

        // try{
        // System.out.println(10/0);
        // }

        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        //     e.printStackTrace();
        // }


        // This is checked Exception therefor we must implement the try and catch block because otherwise compilar will give errar.

        try{
            throw new LowBalanceException();
        }

        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
        
    }

    static void fun2()
    {
        fun1();
    }

    static void fun3()
    {
        fun2();
    }

    public static void main(String[] args)
    {
        fun3();
    }
}
