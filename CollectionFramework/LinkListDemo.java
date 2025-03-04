package CollectionFramework;

import java.util.*;

public class LinkListDemo {
    
    public static void main(String[] args)
    {
        LinkedList<Integer> al1 = new LinkedList<>();

        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        al1.add(0, 5);
        al1.add(10);
        al1.addAll(al2);

        al1.addFirst(3);
        al1.addLast(200);

        

        al1.forEach(n -> System.out.println(n));
    }
}
