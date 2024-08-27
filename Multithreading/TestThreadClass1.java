package Multithreading;

// class MyRun implements Runnable
// {
//     public void run(){}
// }

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        // setPriority(MAX_PRIORITY-2);
    }

    public void run()
    {
        int i = 1;
        while (true) {
            
            System.out.println(i++);
            try{
            Thread.sleep(200);
            }

            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class TestThreadClass1 
{
    public static void main(String[] args) throws Exception
    {
        // Thread t = new Thread(new MyRun() , "my thread");

        MyThread t = new MyThread("My Thread 1");

        // t.setPriority(Thread.MAX_PRIORITY);
        // System.out.println("ID " +t.getId() );
        // System.out.println("Name " +t.getName() );
        // System.out.println("Priority " + t.getPriority());
        // t.start();
        // System.out.println("State " + t.getState());
        // System.out.println("Alive " + t.isAlive());

        t.start();
        t.interrupt();
    }    
}