package CollectionFramework;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapHashMapDemo {
    
    public static void main(String[] args)
    {

        TreeMap<Integer , String> tm = new TreeMap<>(Map.of(0,"A" , 1 , "B" , 2 , "c"));

        HashMap<Integer , String> hm = new HashMap<>(Map.of(0,"A" , 1 , "B" , 2 , "c"));

        tm.put(4,"E" );
        tm.put(3,"D" );
        tm.put(5,"F" );

        Entry<Integer,String> e = tm.firstEntry();

        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(tm.get(3));
        System.out.println(tm.floorEntry(6).getValue());
        System.out.println(tm);


    

    }
}
