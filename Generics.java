// Without Generics (unsafe)
// import java.util.*;

// public class Generics {
//     public static void main(String[] args) {
// List list = new ArrayList();
// list.add("Hello");
// String s = (String) list.get(0); // needs cast 
// System.out.println(s);
//     }
// }

// With Generics
import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        String s = list.get(0);
        System.out.println(s);
    }
}