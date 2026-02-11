abstract class Sample {
    int a = 10;
    void f() {
        System.out.println(a);
    }
    abstract void f2();
}
class Child extends Sample {
    void f2() {
        System.out.println("This is the implementation of the abstract method");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.f();
    }
}

