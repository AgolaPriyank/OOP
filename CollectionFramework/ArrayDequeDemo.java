package CollectionFramework;

import java.util.*;

public class ArrayDequeDemo {
    
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // queue
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        // dq.pollFirst();

        // stack
        // dq.offerLast(50);
        // dq.pollLast();

        dq.offerFirst(1);    
        dq.offerFirst(2);    
        dq.offerFirst(3);    
        dq.offerFirst(4);        

        dq.pollFirst();

        dq.forEach(x -> System.out.println(x));
    }
}

