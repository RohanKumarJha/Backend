class A {
    A() {
        System.out.println("In A");
    }
    A(int num) {
        System.out.println("In A int");
    }
}

class B extends A {
    B() {
        super(6);
        System.out.println("In B");
    }
    B(int num) {
        System.out.println("In B int");
    }
}

class C extends B {
    C() {
        System.out.println("In C");
    }
    C(int num) {
        System.out.println("In C int");
    }
}

public class Super {
    public static void main(String[] args) {
        C obj = new C(6);
    }
}