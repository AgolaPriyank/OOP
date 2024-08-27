package Multithreading;

class MyRunnable implements Runnable 
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i + "Hello");
            i++;
        }
    }
}

public class UsingRunnable  //implements Runnable
{
    // public void run()
    // {
    //     int i = 1;
    //     while(true)
    //     {
    //         System.out.println(i + "Hello");
    //         i++;
    //     }
    // }

    public static void main(String[] args)
    {
        // for same class
        // UsingRunnable u = new UsingRunnable();
        // Thread t = new Thread(u);
        // t.start();

        // for different class
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();


        int i = 1;
        while(true)
        {
            System.out.println(i + "World");
            i++;
        }
    }
}
