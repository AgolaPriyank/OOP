package JavaGenerics;

class A{}
class B extends A{}
class C extends B{}


@SuppressWarnings("unchecked")
class MyArray<T>
{
    T A[] =(T[]) new Object[10];
    int len = 0;

    public void append(T v)
    {
        A[len++] = v;
    }

    public void display()
    {
        for(int i = 0 ; i < len ; i++)
        {
            System.err.println(A[i]);
        } 
    }
}

public class GenericsDemo4 {

        // static <E extends Number> void show(E[] list)
        // {
        //     for(E x : list)
        //     {
        //         System.err.println(x);
        //     }
        // }




            static void fun(MyArray<? extends A> obj)
            {
                obj.display();
            }




    public static void main(String[] args)
    {

            // show(new String[] {"hii" , "Bye" , "Jayyy"});
            // show(new Integer[] {10,20,30,40});


            MyArray<A> ma1 = new MyArray<>();
            // ma1.append("HII");
            // ma1.append("Bye");

            MyArray<Integer> ma2 = new MyArray<>();
            ma2.append(10);
            ma2.append(20);

            fun(ma1);
            // fun(ma2);

    }
    
}
