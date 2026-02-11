// write a program to check whether array contains duplicate or not. time complexity n2.
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("Array contains duplicate");
        else
            System.out.println("Array does not contain duplicate");

        sc.close();
    }
}
