public class SumOfArray {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}

