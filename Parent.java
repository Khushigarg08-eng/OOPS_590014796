public class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Value using this: " + this.x);
        System.out.println("Value using super: " + super.x);
    }
}

class MainClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}


