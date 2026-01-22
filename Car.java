import java.util.Scanner;

public class Car {
    int n;
    int sum = 0;

    public static void main(String[] args) {
        Car c = new Car();              
        Scanner s = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        c.n = s.nextInt();             

        System.out.println("You entered: " + c.n);

        s.close();
    }
}

