class A {
    A() {
        System.out.println("In A");
    }
    A(int val) {
        System.out.println("In A In");
    }
}
class B extends A {
    B() {
        super(5);
        System.out.println("In B");
    }
    B(int val) {
        System.out.println("In B In");
    }
}
public class Super {
    public static void main(String[] args) {
        new B();
        new B(3);

    }
}