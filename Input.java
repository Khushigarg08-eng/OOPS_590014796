import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // if we use nexline instead of next we will get full sentence which we want to print.
        // nextInt() - used to print integer type
        // nextFloat() - used to print any kind of floating integer.
        System.out.println(name);
    }
}
