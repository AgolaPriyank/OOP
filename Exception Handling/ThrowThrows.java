class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimension should not be negative";
    }
}

public class ThrowThrows {
   
    static int area(int l , int b) throws NegativeDimensionException
    {
       if(l < 0 || b <0)
       {
            throw new NegativeDimensionException();
       }
        return l*b;
    }
    
    static void math1()
    {
        try{
        System.out.println("Area is " + area(10,-5));
        }

        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        math1();
    }
}
