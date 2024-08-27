
// import java.util.*;

// class Rectangle  {

//   private double leanth;
//   private double breath;

//   public Rectangle (double l, double b){
//     this.leanth = l;
//     this.breath = b;
//   }
 

//   public void display(){
//     System.out.println("leanth = "+ this.leanth);
//     System.out.println("breath = "+ this.breath);
//   }


  // public double getLeanth(){
  //   return leanth;
  // }
  // public double getBreath(){
  //   return breath;
  // }

  // public void setLeanth(double l){
  //   leanth = l;
  // }
  // public void setBreath(double b){
  //   breath = b;
  // }


  // public double area(){
  //   return leanth*breath;
  // }

  // public double perimater(){
  //   return 2*(leanth+breath);
  // }

  // public String toString(){
  //   return "priyank" ;
  // }
// }


//  abstract  class Parent {

//   public Parent(){
//     System.out.println("parent constructer");
//   }

//   // public Parent(int x){
//   //   System.out.println("peram parent  = " + x);
//   // }

//   // public void display(){
//   //   System.out.println("hello");
//   // }

//   public void math1(){
//     System.out.println("math1 parent");
//   }

//   abstract public void math2();  
// }


// class Child extends Parent{

//   public void math2(){
//     System.out.println("math2 of child");
//   }


//   // public void display(){
//   //   System.out.println("priyank");
//   // }

//   public void addNew(){
//     System.out.println("new method this is");
//   }
//   // public Child(){
//   //   System.out.println("child");
//   // }

//   // public Child(int x){
//   //   System.out.println("peram child  = " + x);
//   // }

//   // public Child(int x , int y){
//   //   super(x);
//   //   System.out.println("2 peram child = "+ y);
//   // }
// }


// interface Test{
//   void math1();
//   void math2();

// }

// interface Test0{
//   void math0();
// }

// class Test1 implements Test , Test0{
  
//     public void math1(){
//       System.out.println(" math1 of Test1 ");
//     }

//     public void math2(){
//       System.out.println("math2 of Test1");
//     }

//     public void math0(){
//         System.out.println("Test0 math0");
//     }

//     public void math3(){
//       System.out.println("math3 of Test1");
//     }
// }


// interface Test{
//   final static int X = 10;
//   public abstract void math1();

//   default  void math2(){
//     System.out.println("math2 of Test");
//   }

//   static void math0(){
//     System.out.println("math0");
//   }

// }

//  interface Test2  extends Test{
//     void math3();
  
// }

// class my implements Test2{

//    public void math1(){
//         System.out.println("math 1");
//     }
//     public void math3(){
//       System.out.println("math3");
//     }

//     // public void math2(){
//     //   System.out.println("math2 of my");
//     // }
// }

// class Outer{
//  static  int x = 10;
//  int y = 20;
//   Inner i =new Inner(); 

//  static class Inner{
    

//     public void innerDis(){
//       System.out.println(x );
//     }
//   }

//   public void outerDis(){
    
//     System.out.println("x = "+ x );
//     // System.out.println("y = " +i.y);
//     i.innerDis();
//   }
// }
abstract class My{
  abstract void show();
}
class Outer{
  public void display(){

    class Inner {
    
      public void show(){
        System.out.println("hello");
      }
    }

    // My m = new My() {
    //   public void show(){
    //     System.out.println("hello");
    //   }
    // };

      Inner i  = new Inner();
     i.show();
  }
}



public class Pracete {
    public static void main(String[] args){
     

     
      // Outer.Inner o = new Outer.Inner();
      // o.innerDis();

    //   Outer o = new Outer();
    //  o.display();
    //   System.out.println("x = "+o.x);
    //   o.outerDis();

    // Outer.Inner or = new Outer(). new Inner();
    // System.out.println(or.y);
    // or.innerDis();

     
      // System.out.println(Test.X);
      //  my m = new my();
      //  m.math2();
      //  m.math1();
      //  m.math3();
       
      // Test t = new Test1() ;
        // t.math1();
        // t.math2();
  
   // Parent p = new Child();
  // p.math1();
  // p.math2(); 
  // p.addNew();

  //  public static void main(String[] args){

  //   Rectangle r1 = new Rectangle(10, 20);
  
  //   Rectangle r2 = new Rectangle(100, 200);
  //  r2.display();
   
    // Child c = new Child(10 , 20);
    //  Rectangle r[] = new Rectangle[3];
    //  r[0] = new Rectangle();
    //  r[0].setLeanth(10);
    //  r[0].setBreath(5);
    //  r[1] = new Rectangle();
    
    // r1.setLeanth(10);
    // r1.setBreath(5);
    // r1.setLeanth(20);
    //  System.out.println("area = " + r[0].area());
    //  System.out.println("perimeter = " + r1.perimater());
    //  System.out.println("is squre = "+ r1);
    //   System.out.println("leanth = " + r[0].getLeanth());
    //  System.out.println("Breath = " + r[0].getBreath());
      
  }

   
}
