public class NonStaticExample {
    int x = 50;

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample();
        System.out.println("Value of x = " + obj.x);
    }
}


