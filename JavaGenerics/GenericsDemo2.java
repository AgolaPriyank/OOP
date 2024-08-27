package JavaGenerics;



// class Data<T>{

//     private T obj;

//     public void setData(T v)
//     {
//         obj = v;
//     }

//     public T getData()
//     {
//         return obj;
//     }
// }


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

public class GenericsDemo2 {
    
    public static void main(String[] args){

        // Data<Integer> d = new Data<>();

        // d.setData(10);

        // System.err.println(d.getData());


        MyArray<Integer> ma = new MyArray<>();

        ma.append(10);
        ma.append(20);
        ma.append(30);

        ma.display();


    }
}
