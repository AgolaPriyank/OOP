package Multithreading;

// class MyThread extends  Thread
// {
//     public void run()
//     {
//         int i = 1;
//         while(true)
//         {
//             System.out.println(i + "Hello");
//             i++;
//         }
//     }
// }

class UsingThread extends Thread
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

    public static void main(String[] args)
    {
        // for different class
        // MyThread t = new MyThread();
        // t.start();

        // for same class
        UsingThread t = new UsingThread();
        t.start();


        int i = 1;
        while(true)
        {
            System.out.println(i + "World");
            i++;
        }
    }
}