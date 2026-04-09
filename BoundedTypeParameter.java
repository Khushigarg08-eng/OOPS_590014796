import java.util.*;

public class BoundedTypeParameter {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0? a : b;
    }

    public static void main(String[] args) {
        Integer num1 = 10, num2 = 20;
        System.out.println("Max Integer:" + max(num1, num2));

        String str1 = "Apple", str2 = "Banana";
        System.out.println("Max String:" + max(str1, str2));
    }
}
