package Multithreading;

class My extends Thread {
    public void run() {
        int i = 1;
        while (i < 500) {
            System.out.println(i++ + "My Thread");
        }
    }
}

public class TestThreadClass2 {
    public static void main(String[] args) throws Exception {
        My t = new My();
        // t.setDaemon(true);
        t.start();

        // try{
        // Thread.sleep(100);
        // }
        // catch(Exception e)
        // {
        // System.out.println(e);
        // }

        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        int i = 1;
        while (i < 500) {
            System.out.println(i++ + "main");
            Thread.yield();
        }
    }
}
