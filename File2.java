import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream fos = new FileOutputStream("copy.txt");

            System.out.println("Enter text to save in file:");
            String data = sc.nextLine();
            byte[] b = data.getBytes();
            fos.write(b);

            fos.close();
            System.out.println("Data saved successfully in copy.txt");

        } catch (IOException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
