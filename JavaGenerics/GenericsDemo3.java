package JavaGenerics;

interface A{}
class B implements A{}
class C implements A{}


@SuppressWarnings("unchecked")
class MyArray<T extends Number>
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

// class MyArray2 extends MyArray<String>
// {

// }

// class MyArray2<T> extends MyArray<T>
// {

// }

public class GenericsDemo3 {
    
    public static void main(String[] args){

        
        // MyArray ma = new MyArray();

        // MyArray<String,Integer> ma = new MyArray<>();

        // MyArray2 ma = new MyArray2();

       // MyArray2<String> ma = new MyArray2<>();

       MyArray<Double> ma = new MyArray<>();

        // ma.append(10);
        // ma.append("HIii");
         ma.append(30.54);

        ma.display();


    }
}
