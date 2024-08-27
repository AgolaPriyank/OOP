// we can create a only one object of singletonclass 

class CoffeeMachine
{
   private  float coffeQty;
   private float milkQty;
   private float waterQty;
   private float sugarQty;

   static private CoffeeMachine my = null;

   private CoffeeMachine()
   {
      coffeQty = 1;
      milkQty = 1;
      waterQty = 1;
      sugarQty = 1;
   }

   public void fillwater(float qty)
   {
      waterQty = qty;
   }

   static CoffeeMachine getInstance()
   {
      if(my == null)
      {
         my = new CoffeeMachine();
      }
      return my;
   }
}

public class SingletonClass {
   public static void main(String[] args)
   {

      CoffeeMachine m1 = CoffeeMachine.getInstance();
      CoffeeMachine m2 = CoffeeMachine.getInstance();
      CoffeeMachine m3 = CoffeeMachine.getInstance();

      System.out.println(m1 + " " + m2 + " " + m3);

      if(m1==m2 && m1==m3){
         System.out.println("same");
      }

   }
}
