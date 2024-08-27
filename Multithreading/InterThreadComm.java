package Multithreading;

class MyData1 {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        value = v;
        System.out.println("Producer : " + value);
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        x = value;

        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    MyData1 data;

    public Producer(MyData1 d) {
        data = d;
    }

    public void run() {
        int count = 1;
        while (count <= 50) {
            data.set(count);

            count++;
        }
    }
}

class Consumer extends Thread {
    MyData1 data;

    public Consumer(MyData1 d) {
        data = d;
    }

    public void run() {
        int count = 1;
        int value;
        while (count <= 50) {
            value = data.get();
            System.out.println("Consumer : " + value);
            count++;
        }
    }
}

public class InterThreadComm {
    public static void main(String[] args) {
        MyData1 data = new MyData1();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();

    }
}
