import java.util.*;

public class wildcard {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(20);

        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("Java");

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("String List");
        printList(strList);
    }
}
