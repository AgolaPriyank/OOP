package JavaGenerics;

@SuppressWarnings("unchecked")
class GenericDemo<T>
{
    T data[]= (T[]) new Object[3];

    public static void main(String[] args)
    {

        GenericDemo<String> gd = new GenericDemo<>();

        gd.data[0] = "Hii";
        gd.data[1] = "Hello";
       // gd.data[3] = 10;
       gd.data[2] = "HYYYY";

       String str = gd.data[0];

       System.err.println(str);
    }
}