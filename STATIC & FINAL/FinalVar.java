public class FinalVar {

   final int z;

   // Cannot make a static reference to the non-static field z
   // static{
   //    z = 10;
   // }

   {
      z = 10;
   }

   final int p ;
   public FinalVar()
   {
      p = 20;
   }

   public FinalVar(int a)
   {
      p = a;
   }

   public static void main(String[] args)
   {
      final int X = 10;

      final int y;
       // finla varebal is not print without initialize
      //  System.out.println(y);
     
      y = 20;
      System.out.println(y);

      // x cannot be resolved to a variable -> we can not change the final var  value 
      // x = 50;
   }
}
