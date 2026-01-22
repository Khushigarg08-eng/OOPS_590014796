import java.util.*;
public class ArraySum2 {

    public static void main(Integer [] args) {
        // we cannot add integer in it, it will produce an error we can change it downwards.
        int sum = 0;
        int sum_array = 0;
        Scanner s = new Scanner(System.in);
        sum = s.nextInt();
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = s.nextInt();
            sum_array += args[i];
        }
        if (sum == sum_array) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}



