// final method can not be oveirided   
// final class can not be extends


// final class Super

 class Super
{
   final void show()
   {
      System.out.println("hello");
   }
}

// class Sub extends Super
// The type Sub cannot subclass the final class Super

 class Sub extends Super
{
   // Cannot override the final method from Super
   // void show()
   // {
   //    System.out.println("hiiii");
   // }
}

public class FinalMathodClass {
   public static void main(String[] args)
   {

   }
}
