class Test{
  static int s;
   static {
      System.out.println("block 3");
      s = 10;
   }

   static {
      System.out.println("block 4");
      System.out.println(s);
   }
}

public class StaticBlock {


   static {
      System.out.println("block 1");
      Test.s = 20;
      System.out.println(Test.s);
   }
   public static void main(String[] args)
   {
      // Test t1 = new Test();
      System.out.println("main");
      Test t1 = new Test();
      
   }

   static{
      System.out.println("block 2");
      
   }
}
