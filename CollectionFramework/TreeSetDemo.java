package CollectionFramework;
import java.util.*;

public class TreeSetDemo {
    
    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,50,30,80,10,40));

        // Collection<Integer> tc = new TreeSet<>(List.of(10,50,30,80,10,40));

        // SortedSet<Integer> ss = new TreeSet<>(List.of(10,50,30,80,10,40));

        ts.add(35);
        

        System.out.println(ts.floor(55));

        System.out.println(ts);

    }
}
