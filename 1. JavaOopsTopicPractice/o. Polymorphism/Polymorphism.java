class B {
    public void show() {
        System.out.println("In B show");
    }
}

class A extends B {
    public void show() {
        System.out.println("In A show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

        obj = new A();
        obj.show();
    }
}