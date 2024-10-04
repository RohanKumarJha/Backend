class B {
    B() {
        super();
        System.out.println("In B");
    }
    B(int n) {
        System.out.println("In B int");
    }
}

class A extends B {
    A() {
        super();
        System.out.println("In A");
    }
    A(int n) {
        super(5);
        System.out.println("In A int");
    }
}

public class Super {
    public static void main(String[] args) {
        A obj = new A(5);
    }
}