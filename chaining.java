class A {
    A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    B() {
        super();   
        System.out.println("Class B constructor");
    }
}
