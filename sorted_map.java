package collections;
    
import java.util.TreeMap;
import java.util.SortedMap;

public class sorted_map {

    public static void main(String[] args) {

        SortedMap<Integer, String> smap = new TreeMap<>();

        smap.put(3, "Mango");
        smap.put(1, "Apple");
        smap.put(2, "Banana");

        System.out.println("SortedMap: " + smap);

        smap.remove(2);

        smap.put(3, "Orange");

        System.out.println("Updated SortedMap: " + smap);
    }
}
