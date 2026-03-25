package collections;
import java.util.Set;
import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Litchi");
        set.add("banana");
        set.add("Pineapple");

        System.out.println("Set: " + set);
        
        set.remove("Apple");

        set.remove("banana");
        set.add("Mango");

        System.out.println("Updated set:" + set);
    }
    
}
