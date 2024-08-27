public class FinallyBlock {
    
    static void math1() throws Exception
    {
        throw new Exception();
    }
    public static void main(String[] args)
    {
        try
        {
            math1();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        finally 
        {
            System.out.println("Final massage");
        }
    }
}
