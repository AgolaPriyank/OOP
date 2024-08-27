class Test
{
   static int P = 10;
   int y = 20;
   String cName;

   Test(){

   }
   Test(String cn)
   {
      cName = cn;
   }

   void show()
   {
      System.out.println(P + " " + y);
   }

}


public class StaticVar
{
   public static void main(String[] args)
   {

      Test t1 = new Test("BMW 1");
      Test t2 = new Test("BMW 2");

      System.out.println(Test.P);
      t1.P = 100;
      t1.y = 200;
      t1.show();
      t2.show();
      

      System.out.println(t1.cName +" "+ Test.P);
      System.out.println(t2.cName +" "+ Test.P);

   }
}