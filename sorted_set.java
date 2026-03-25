package collections;

import java.util.TreeSet;
import java.util.SortedSet;
public class sorted_set {

    public static void main(String[] args) {

        SortedSet<Integer> sset = new TreeSet<>();

        sset.add(30);
        sset.add(10);
        sset.add(20);

        System.out.println("SortedSet: " + sset);

        sset.remove(10);

        sset.remove(20);
        sset.add(25);

        System.out.println("Updated SortedSet: " + sset);
    }
}
